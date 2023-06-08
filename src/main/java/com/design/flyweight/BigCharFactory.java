package com.design.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xpf
 * @since 2023/6/8
 */
public class BigCharFactory {

    private Map<Character, BigChar> pool = new HashMap<>();
    private static final BigCharFactory factory = new BigCharFactory();

    private BigCharFactory() {}

    public static BigCharFactory getInstance() {
        return factory;
    }

    public synchronized BigChar getBigChar(char charName) {
        BigChar bc = pool.get(charName);
        if (bc == null) {
            bc = new BigChar(charName);
            pool.put(charName, bc);
        }
        return bc;
    }

    public void printSize() {
        System.out.println("pool size: " + pool.size());
    }

}

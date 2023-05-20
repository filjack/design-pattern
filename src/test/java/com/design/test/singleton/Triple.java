package com.design.test.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xpf
 * @since 2023/5/19
 */
public class Triple {

    private int num;

    private static Triple[] triples = new Triple[]{
            new Triple(0),
            new Triple(1),
            new Triple(2)
    };


    private Triple(int num) {
        this.num = num;
    }

    public static Triple getInstance(int i) {
        return triples[i];
    }

}

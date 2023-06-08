package com.design.flyweight;

/**
 * @author xpf
 * @since 2023/6/8
 */
public class BigString {
    private BigChar[] bigChars;

    public BigString(String string, boolean shared) {
        bigChars = new BigChar[string.length()];
        if (shared) {
            initShared(string);
        } else {
            initUnShared(string);
        }
    }

    private void initShared(String string) {
        BigCharFactory factory = BigCharFactory.getInstance();
        for (int i = 0; i < string.length(); i++) {
            bigChars[i] = factory.getBigChar(string.charAt(i));
        }
    }

    private void initUnShared(String string) {
        for (int i = 0; i < string.length(); i++) {
            bigChars[i] = new BigChar(string.charAt(i));
        }
    }

    public void print() {
        for (int i = 0; i < bigChars.length; i++) {
            bigChars[i].print();
        }
    }

}

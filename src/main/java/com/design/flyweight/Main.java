package com.design.flyweight;

/**
 * @author xpf
 * @since 2023/6/8
 */
public class Main {

    private static BigString[] bigStrings = new BigString[1000];

    public static void main(String[] args) {
//        if (args.length == 0) {
//            System.out.println("Usage: java Main digits");
//            System.out.println("Example: java Main 1212123");
//            System.exit(0);
//        }
//        BigString bigString = new BigString(args[0], true);
//        bigString.print();
        System.out.println("共享时：");
        testAllocation(true);
        System.out.println("不共享时：");
        testAllocation(false);
    }

    public static void testAllocation(boolean shared) {
        for (int i = 0; i < bigStrings.length; i++) {
            bigStrings[i] = new BigString("1212123", shared);
        }
        showMemory();
    }

    public static void showMemory() {
        Runtime.getRuntime().gc();
        long used = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println("使用内存：" + used);
    }

}

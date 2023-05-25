package com.design.test.strategy;

/**
 * @author xpf
 * @since 2023/5/25
 */
public class App {

    public static void main(String[] args) {
        String[] data = {"Dumpty", "Bowman", "Carroll", "ElfLand", "Alice"};
        SortAndPrint sap = new SortAndPrint(data, new SelectionSorter());
        sap.executor();
    }

}

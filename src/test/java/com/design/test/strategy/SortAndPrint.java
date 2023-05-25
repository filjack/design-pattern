package com.design.test.strategy;

/**
 * @author xpf
 * @since 2023/5/25
 */
public class SortAndPrint {

    Comparable[] data;
    Sorter sorter;

    public SortAndPrint(Comparable[] data, Sorter sorter) {
        this.data = data;
        this.sorter = sorter;
    }

    public void executor() {
        print();
        sorter.sort(data);
        print();
    }

    private void print() {
        for (Comparable datum : data) {
            System.out.print(datum + ",");
        }
        System.out.println();
    }

}

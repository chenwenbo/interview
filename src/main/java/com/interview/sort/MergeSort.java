package com.interview.sort;

/**
 * 归并排序:基本排序：归并（Merge）排序法是将两个（或两个以上）有序表合并成一个新的有序表，
 * 即把待排序序列分为若干个子序列，每个子序列是有序的。
 * 然后再把有序子序列合并为整体有序序列。
 */
public class MergeSort {

    public static void main(String[] args) {
        int intArrs[] = {49, 38, 65, 17, 18, 23, 34, 15, 35, 25, 53, 51};
        mergeSort(intArrs);
        for (int i = 0; i < intArrs.length; i++) {
            System.out.println(intArrs[i]);
        }
    }

    private static void mergeSort(int[] intArrs) {

    }

}

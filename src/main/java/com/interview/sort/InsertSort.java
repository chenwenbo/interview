package com.interview.sort;

/**
 * 插入排序,假设插入之前数组是有序的状态,
 * 只需要将带插入的数据与已有的数组进行比较,大于插入数据的进行后移。
 */
public class InsertSort {

    public static void main(String[] args) {
        int intArrs[] = {49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 5, 4, 62, 99, 98, 54, 56, 17, 18, 23, 34, 15, 35, 25, 53, 51};
        for (int i = 1; i < intArrs.length; i++) {
            int temp = intArrs[i];
            int j;
            for (j = i - 1; j >= 0 && intArrs[j] > temp; j--) {
                intArrs[j + 1] = intArrs[j];
            }
            intArrs[j + 1] = temp;
        }
        for (int i = 0; i < intArrs.length; i++) {
            System.out.println(intArrs[i]);
        }
    }

}

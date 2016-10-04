package com.interview.sort;

/**
 * 冒泡排序:（1）基本思想：在要排序的一组数中，对当前还未排好序的范围内的全部数，
 * 自上而下对相邻的两个数依次进行比较和调整，让较大的数往下沉，较小的往上冒。
 * 即：每当两相邻的数比较后发现它们的排序与排序要求相反时，就将它们互换。
 */
public class BubbleSort {

    public static void main(String[] args) {
        int intArrs[] = {49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 5, 4, 62, 99, 98, 54, 56, 17, 18, 23, 34, 15, 35, 25, 53, 51};
        int temp = 0;
        for (int i = 0; i < intArrs.length - 1; i++) {
            for (int j = 0; j < intArrs.length - i - 1; j++) {
                if (intArrs[j] > intArrs[j + 1]) {
                    temp = intArrs[j];
                    intArrs[j] = intArrs[j + 1];
                    intArrs[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < intArrs.length; i++) {
            System.out.println(intArrs[i]);
        }
    }
}

package com.interview.sort;

/**
 * 选择排序:基本思想：在要排序的一组数中，选出最小的一个数与第一个位置的数交换；
 * 然后在剩下的数当中再找最小的与第二个位置的数交换，如此循环到倒数第二个数和最后一个数比较为止。
 */
public class SelectSort {

    public static void main(String[] args) {
        int intArrs[]={1,54,6,3,78,34,12,45};
        for (int i = 0; i < intArrs.length; i++) {
            int j;
            int temp = intArrs[i];
            int position = i;
            for (j = i + 1; j < intArrs.length; j++) {
                if (intArrs[j] < temp) {
                    position = j;
                    temp = intArrs[j];
                }
            }
            intArrs[position] = intArrs[i];
            intArrs[i] = temp;
        }

        for (int i = 0; i < intArrs.length; i++) {
            System.out.println(intArrs[i]);
        }

    }

}


package com.interview.sort;

/**
 * 快速排序
 *（1）基本思想：选择一个基准元素,通常选择第一个元素或者最后一个元素,
 * 通过一趟扫描，将待排序列分成两部分,一部分比基准元素小,一部分大于等于基准元素,
 * 此时基准元素在其排好序后的正确位置,然后再用同样的方法递归地排序划分的两部分。
 */
public class QuickSort {

    public static void main(String[] args) {
        int intArrs[] = {49, 35, 25, 53, 51};
        if (intArrs.length > 0) {
            _quickSort(intArrs,0, intArrs.length - 1);
        }
        for (int i = 0; i < intArrs.length; i++) {
            System.out.println(intArrs[i]);
        }
    }

    private static void _quickSort(int[] list, int low, int high) {
        if (low < high){
            int middle =getMiddle(list, low, high);  //将list数组进行一分为二
            _quickSort(list, low, middle - 1);       //对低字表进行递归排序
            _quickSort(list,middle + 1, high);       //对高字表进行递归排序
        }
    }

    private static int getMiddle(int[] number, int low, int high) {
        int temp = number[low];
        while (low < high) {
            while (low < high && number[high] > temp) {
                high--;
            }
            number[low] = number[high]; //比基数小的数移动到低端
            while (low < high && number[high] < temp) {
                low++;
            }
            number[high] = number[low]; //比基数大的数移动到高端
        }
        number[low] = temp;
        return low;
    }

}

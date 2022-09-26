package com.sort;

import java.util.Arrays;

/**
 * 冒泡排序
 * 它是一种较简单的排序算法。它会遍历若干次要排序的数列，每次遍历时，它都会从前往后依次的比较相邻两个数的大小；
 * 如果前者比后者大，则交换它们的位置。这样，一次遍历之后，最大的元素就在数列的末尾！
 * 采用相同的方法再次遍历时，第二大的元素就被排列在最大元素之前。重复此操作，直到整个数列都有序为止！
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{3,4,2,5,8,7,6,5,9};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] < arr[i]) {
                        changeSpace(arr,i,j);
                    }
                }
        }
    }

    private static void changeSpace(int[] arr, int i, int j) {
        int m = arr[i];
        arr[i] = arr[j];
        arr[j] = m;
    }


}

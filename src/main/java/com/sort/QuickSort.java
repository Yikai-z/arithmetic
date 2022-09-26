package com.sort;

public class QuickSort {
    public static void main(String[] args) {

        int i;
        int a[] = {30,40,60,10,20,50};

        System.out.printf("before sort:");
        for (i=0; i<a.length; i++)
            System.out.printf("%d ", a[i]);
        System.out.printf("\n");

        quickSort(a, 0, a.length-1);

        System.out.printf("after  sort:");
        for (i=0; i<a.length; i++)
            System.out.printf("%d ", a[i]);
        System.out.printf("\n");
    }


    /*
     * 快速排序
     *
     * 参数说明:
     *     a -- 待排序的数组
     *     l -- 数组的左边界(例如，从起始位置开始排序，则l=0)
     *     r -- 数组的右边界(例如，排序截至到数组末尾，则r=a.length-1)
     */
    public static void quickSort(int[] a, int l, int r) {
        if (l < r) {
            int x,i,j;
            // 标
            i = l;
            j = r;
            x = a[l];
            while (i < j) {
                while (i< j && a[j] > x) j--;
                if (i < j )a[i++] = a[j];

                while (i < j && a[i] < x ) i++;
                if (i < j ) a[j--] = a[i];
            }
            a[i] = x;
            quickSort(a,l,i-1);
            quickSort(a,i+1,r);
        }
    }


}

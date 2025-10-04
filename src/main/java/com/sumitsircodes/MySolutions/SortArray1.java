package com.sumitsircodes.MySolutions;

import java.util.Arrays;

public class SortArray1 {
    public static void main(String[] args) {
        int[] arr = {15, 9, 56, 45, 28};
        int[] sortedArray = ArraySorter(arr);
        System.out.println(Arrays.toString(sortedArray));
    }

    public static int[] ArraySorter(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }


        }
        return arr;
    }
}
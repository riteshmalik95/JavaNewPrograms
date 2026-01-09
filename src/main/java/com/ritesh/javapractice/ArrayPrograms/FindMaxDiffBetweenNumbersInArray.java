package com.ritesh.javapractice.ArrayPrograms;

import java.util.Arrays;

public class FindMaxDiffBetweenNumbersInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 15, 20, 30};
        int diff = FindMaxDiff(arr);
        System.out.println("Maximum difference beween two items in an array : " + diff);
    }

    private static int FindMaxDiff(int[] arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int diff = arr[arr.length - 1] - arr[0];


        return diff;
    }
}

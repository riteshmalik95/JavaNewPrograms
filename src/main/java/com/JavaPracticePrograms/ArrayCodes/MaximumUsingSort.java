package com.JavaPracticePrograms.ArrayCodes;

import java.util.Arrays;

public class MaximumUsingSort {
    public static void main(String[] args) {
        int[] arr = {10, 45, 23, 89, 34};

        Arrays.sort(arr);

        System.out.println("Maximum Element : "+arr[arr.length-1]);
    }
}

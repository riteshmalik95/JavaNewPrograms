package com.JavaPracticePrograms.ArrayCodes;

import java.util.Arrays;

public class MinimumElementUsingSort {
    public static void main(String[] args) {
        int[] arr = {76, 45, 95, 89, 47};

        Arrays.sort(arr);

        System.out.println("Minimum Element :" + arr[0]);
    }
}

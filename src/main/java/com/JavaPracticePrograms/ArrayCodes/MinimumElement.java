package com.JavaPracticePrograms.ArrayCodes;

public class MinimumElement {

    public static void main(String[] args) {

        int[] arr = {75, 45, 23, 89, 34};

        int min = arr[0]; // assume first element is minimum

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Minimum element: " + min);
    }
}

package com.ritesh.javapractice.ArrayPrograms;

public class FindLargestNumFromArray {
    public static void main(String[] args) {
        int[] arr = {12, 26, 47, 79, 2000, 56, 28};
        int largestNum = FindLargestNum(arr);
        System.out.println(largestNum);
    }

    private static int FindLargestNum(int[] arr) {
        int largestNum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largestNum) {
                largestNum = arr[i];
            }
        }
        return largestNum;
    }
}

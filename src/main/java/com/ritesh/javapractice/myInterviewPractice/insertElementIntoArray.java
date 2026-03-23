package com.ritesh.javapractice.myInterviewPractice;

import java.util.Arrays;

public class insertElementIntoArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        int[] newArr = new int[arr.length + 1];
        newArr[2] = 3;

        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i != 2) {
                newArr[i] = arr[j++];
            }
        }
        System.out.println(Arrays.toString(newArr));

    }
}

package com.JavaPracticePrograms.ArrayCodes;

import java.util.Arrays;

public class InsertElementAtIndex {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int index = 2;
        int element = 25;

        int[] newArr = new int[arr.length + 1];

        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == index) {
                newArr[i] = element;
            } else {
                newArr[i] = arr[j];
                j++;
            }
        }
        System.out.println(Arrays.toString(newArr));
    }
}

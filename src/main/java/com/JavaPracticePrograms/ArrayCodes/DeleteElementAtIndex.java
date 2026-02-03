package com.JavaPracticePrograms.ArrayCodes;
//Create a new array of size −1
//Copy all elements except the index to delete
//continue skips the unwanted element

import java.util.Arrays;

public class DeleteElementAtIndex {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        int index = 2; // index to delete (30)

        // Validate index
        if (index < 0 || index >= arr.length) {
            System.out.println("Invalid index");
            return;
        }

        int[] newArr = new int[arr.length - 1];

        for (int i = 0, j = 0; i < arr.length; i++) {

            if (i == index) {
                continue; // skip the element to delete
            }
            newArr[j] = arr[i];
            j++;
        }

        System.out.println("Original Array : " + Arrays.toString(arr));
        System.out.println("After Deletion : " + Arrays.toString(newArr));
    }
}


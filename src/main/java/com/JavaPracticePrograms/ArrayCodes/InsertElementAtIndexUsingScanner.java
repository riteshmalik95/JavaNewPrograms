package com.JavaPracticePrograms.ArrayCodes;

import java.util.Arrays;
import java.util.Scanner;

public class InsertElementAtIndexUsingScanner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        // Input array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Input index and element
        System.out.print("Enter index to insert: ");
        int index = sc.nextInt();

        System.out.print("Enter element to insert: ");
        int element = sc.nextInt();

        // Validate index
        if (index < 0 || index > arr.length) {
            System.out.println("Invalid index");
            return;
        }

        int[] newArr = new int[arr.length + 1];

        // Insert logic
        for (int i = 0, j = 0; i < newArr.length; i++) {

            if (i == index) {
                newArr[i] = element;
            } else {
                newArr[i] = arr[j];
                j++;
            }
        }

        System.out.println("Array after insertion:");
        System.out.println(Arrays.toString(newArr));

        sc.close();
    }
}


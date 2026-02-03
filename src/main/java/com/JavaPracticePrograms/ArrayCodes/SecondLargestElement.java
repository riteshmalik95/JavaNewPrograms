package com.JavaPracticePrograms.ArrayCodes;

import java.util.Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr={24,65,78,77,25,36};

        Arrays.sort(arr);

        System.out.println("Second Largest Element: "+arr[arr.length-2]);
    }
}

package com.sumitsircodes.MySolutions;

import java.util.Arrays;

public class ArraySecondLargestElement {
    public static void main(String[] args) {
        int [] arr={75,49,12,82,97};
        Arrays.sort(arr);
        System.out.println(arr[arr.length-2]);//Second Largest Element
        System.out.println(arr[arr.length-1]);//Largest Element
    }
}

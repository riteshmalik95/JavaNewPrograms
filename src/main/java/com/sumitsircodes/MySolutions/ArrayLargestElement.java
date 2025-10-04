package com.sumitsircodes.MySolutions;

public class ArrayLargestElement {
    public static void main(String[] args) {
        int [] arr={12, 18, 22, 45, 56};
        int max=arr[0];
        for(int num:arr){
            if (num>max){ //if my number is greater than maximum then update num max to number
                max=num;
            }
        }
        System.out.println("Array Largest Element is: "+max);
    }
}

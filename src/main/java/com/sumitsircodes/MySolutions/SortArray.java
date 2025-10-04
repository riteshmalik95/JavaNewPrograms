package com.sumitsircodes.MySolutions;

public class SortArray {
    public static void main(String[] args) {
        int [] arr={11,75,25,96,18};
        int temp;
        for(int i=0;i< arr.length;i++){
            for (int j=i+1;j< arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }

            }

        }
        // Print only after sorting is finished
        System.out.println("Sorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

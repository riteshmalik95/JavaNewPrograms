package com.NewCodesUdemy;

public class SumOfElements1 {
    public static void main(String[] args) {
        int arr[]={12,15,45,56,47};
        int sum=sumOfArray(arr);
        System.out.println(sum);
    }
    private static int sumOfArray(int arr[]) {
        int sum=0;
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
            sum=sum+arr[i];


        }
        return sum;
    }
}

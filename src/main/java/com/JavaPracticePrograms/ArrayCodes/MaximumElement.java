package com.JavaPracticePrograms.ArrayCodes;

public class MaximumElement {
    public static void main(String[] args) {
        int[] arr={55,95,45,78,25};
        int max=arr[0];//Assume first element is max

        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Maximum Element :"+max);
    }
}

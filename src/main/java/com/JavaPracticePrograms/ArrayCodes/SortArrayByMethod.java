package com.JavaPracticePrograms.ArrayCodes;

import java.util.Arrays;

public class SortArrayByMethod {
    public static void main(String[] args) {
        int[] arr={36,23,65,16,11};
        int[] sortedArray=sortArray(arr);
        System.out.println(Arrays.toString(sortedArray));
    }
    private static int[] sortArray(int[] arr){
        int temp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
      return arr;
    }
}

package com.ritesh.javapractice.ArrayPrograms;

import java.util.Arrays;
import java.util.HashSet;

//By using HAshSet
public class FindMissingNumbersInArray {
    public static void main(String[] args) {
        int [] arr={1,2,5,6,8,60,15};
        Arrays.sort(arr);
        int max=arr[arr.length-1];
        FindMissingNumbers(arr,max);

    }

    private static void FindMissingNumbers(int[] arr, int max) {
        HashSet<Integer> set=new HashSet<>();
        for (int num:arr){
            set.add(num);
        }
        for (int i=1;i<=max;i++){
            if(!set.contains(i)){
                System.out.println(i+" ");
            }
        }
    }
}

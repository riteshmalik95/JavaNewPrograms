package com.sumitsircodes.MySolutions;

public class DuplicateElement {
    public static void main(String[] args) {
        int [] arr={12,36,27,36,48,12};
        System.out.println("all Duplicate Elements:");
        for(int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);

                }
            }
        }
    }
}

package com.JavaPracticePrograms.ReverseStrings;

public class TwoPointerMethod {
    public static void main(String[] args) {
        String str="Ritesh Malik";
        char[] arr=str.toCharArray();
        int i=0,j=arr.length-1;
        while(i<j){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        System.out.println(new String(arr));
        //It converts a character array (char[]) into a String object
    }
}

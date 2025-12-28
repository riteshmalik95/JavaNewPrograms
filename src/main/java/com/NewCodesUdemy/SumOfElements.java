package com.NewCodesUdemy;

public class SumOfElements {
    public static void main(String[] args) {
        int[] a={4,8,12,16,20};
        int sum=sumArray(a);
        System.out.println(sum);

    }
    private static int sumArray(int[] a) {
        int sum = 0;
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
            sum=sum+a[i];
        }
        return sum;
    }
}

//Another Method
//        int sum=0;
//        int[] a={4,8,12,16,20};
//        for (int i=0;i<a.length;i++){
//            sum=sum+a[i];
//        }
//        System.out.println(sum);
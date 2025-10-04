package com.sumitsircodes.MySolutions;

public class FiboSeries {
    public static void main(String[] args) {
        int n=10;
        int a=0,b=1;
        System.out.println("Fibonacci Series:");
        for (int i=1;i<=10;i++){
            System.out.print(a+",");
            int next=a+b;
            a=b;
            b=next;
        }
    }
}

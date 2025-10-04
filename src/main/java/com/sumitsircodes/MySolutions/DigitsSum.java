package com.sumitsircodes.MySolutions;

public class DigitsSum {
    public static void main(String[] args) {
        int number=258425965;
        int sum=0;
        int count=0;
        while(number>0){
            int d=number%10;
            sum=sum+d;
            number=number/10;
            count++;
        }
        System.out.println("Sum od digits: "+sum+" Digit counts: " +count);
    }
}

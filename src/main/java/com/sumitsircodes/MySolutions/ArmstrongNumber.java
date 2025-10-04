package com.sumitsircodes.MySolutions;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num=370,temp,sum = 0;
        int original=num;
        while (num >0){
            temp=num%10;
            sum += Math.pow(temp, 3);
            num=num/10;
        }
        if(sum==original){
            System.out.println(original+" is a Armstrong Number");
        }else {
            System.out.println(original+" is not a Armstrong Number");
        }
    }
}

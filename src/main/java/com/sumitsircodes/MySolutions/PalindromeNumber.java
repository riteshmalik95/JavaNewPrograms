package com.sumitsircodes.MySolutions;

public class PalindromeNumber {
    public static void main(String[] args) {
        int num=1221;
        int original=num,rev=0;
        while (num>0){
            int temp=num%10;
            rev=rev*10+temp;
            num=num/10;
        }
        if (original == rev) {
            System.out.println(original + " is a Palindrome Number");
        } else {
            System.out.println(original + " is not a Palindrome Number");
        }
    }
}

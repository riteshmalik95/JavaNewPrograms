package com.sumitsircodes.MySolutions;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "nitin";
        String rev = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            rev = rev + str.charAt(i);
        }
        if (str.equals(rev)) {
            System.out.println(str + " is a Palindrome String");
        } else {
            System.out.println(str + " is not a Palindrome String");
        }
    }

    }

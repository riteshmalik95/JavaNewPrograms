package com.JavaPracticePrograms.StringCodes;

public class PalindromeCheck {
    public static void main(String[] args) {
        String str="nitin";
        System.out.println(str.equals(new StringBuilder(str).reverse().toString()));
    }
}

package com.JavaPracticePrograms.ReverseStrings;

public class String_Builder {
    public static void main(String[] args) {
        String s="Ritesh Malik";
        String rev=new StringBuilder(s).reverse().toString();
        System.out.println(rev);
    }
}

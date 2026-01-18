package com.JavaPracticePrograms.ReverseStrings;

public class String_Buffer {
    public static void main(String[] args) {
        String s="Automation Tester";
        String rev=new StringBuffer(s).reverse().toString();
        System.out.println(rev);
    }
}

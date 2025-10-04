package com.sumitsircodes.MySolutions;
//By StringBuffer or StringBuilder
public class StringReverse1 {
    public static void main(String[] args) {
        String str="Indian";
        String reversed=new StringBuffer(str).reverse().toString();
        System.out.println(reversed);
    }
}

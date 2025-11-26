package com.miscellaneous;

public class StaticMethods {
    static int square(int n){
        return n*n;
    }
    public static void main(String[] args) {
        System.out.println(StaticMethods.square(5));
    }
}

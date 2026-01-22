package com.JavaPracticePrograms.StringCodes;

public class CheckDigitsUsingRegex {
    public static void main(String[] args) {
        String s="automation";

        boolean isOnlyDigits=s!=null && s.matches("\\d+");
        System.out.println(isOnlyDigits);
    }
}

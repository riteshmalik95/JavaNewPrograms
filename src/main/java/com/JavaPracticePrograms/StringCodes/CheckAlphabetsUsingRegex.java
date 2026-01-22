package com.JavaPracticePrograms.StringCodes;

public class CheckAlphabetsUsingRegex {

    public static void main(String[] args) {

        String str = "RiteshMalik";

        boolean isOnlyAlphabets = str != null && str.matches("[a-zA-Z]+");

        System.out.println("String contains only alphabets: " + isOnlyAlphabets);
    }
}


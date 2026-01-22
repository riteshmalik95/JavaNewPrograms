package com.JavaPracticePrograms.StringCodes;

public class CountsWords {

    public static void main(String[] args) {

        String sentence = "Java is very easy language";

        if (sentence == null || sentence.trim().isEmpty()) {
            System.out.println("Word count: 0");
            return;
        }

        String[] words = sentence.trim().split("\\s+");
        //.split("\\s+")
        // //s---> Any whitespace (space, tab, newline)
        //Splits the string using whitespace as delimiter

        System.out.println("Word count: " + words.length);
    }
}


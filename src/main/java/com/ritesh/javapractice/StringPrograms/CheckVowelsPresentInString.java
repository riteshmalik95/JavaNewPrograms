package com.ritesh.javapractice.StringPrograms;

public class CheckVowelsPresentInString {
    public static void main(String[] args) {
        String str="Ritesh Malik";
        System.out.println(StringContainsVowels(str));
    }

    private static boolean StringContainsVowels(String str) {
        return str.toLowerCase().matches(".*[aeiou].*");
    }
}

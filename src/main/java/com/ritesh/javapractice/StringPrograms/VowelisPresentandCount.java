package com.ritesh.javapractice.StringPrograms;


public class VowelisPresentandCount {
    public static void main(String[] args) {
        String str = "Ritesh Malik";
        System.out.println(StringContainsVowels(str));
        System.out.println(TotalVowelsCount(str));
    }

    private static int TotalVowelsCount(String str) {
        int count = 0;
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }

        }
        return count;
    }

    private static boolean StringContainsVowels(String str) {
        return str.toLowerCase().matches(".*[aeiou].*");
    }
}
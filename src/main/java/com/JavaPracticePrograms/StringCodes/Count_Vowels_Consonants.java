package com.JavaPracticePrograms.StringCodes;

public class Count_Vowels_Consonants {

    public static void main(String[] args) {

        String s = "Ritesh Malik";
        int vowels = 0, consonants = 0;

        for (char c : s.toLowerCase().toCharArray()) {

            if ("aeiou".indexOf(c) != -1) {
                vowels++;
            }
            else if (Character.isLetter(c)) {
                consonants++;
            }
        }

        System.out.println("Vowels : " + vowels + " Consonants : " + consonants);
    }
}

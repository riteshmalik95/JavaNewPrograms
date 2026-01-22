package com.JavaPracticePrograms.StringCodes;

public class Count_Vowels_ConsonantsNew {
    public static void main(String[] args) {

        String s = "Ritesh Malik";
        int vowels = 0, consonants = 0;

        for (char c : s.toLowerCase().toCharArray()) {

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowels++;
            }
            else if (Character.isLetter(c)) {
                consonants++;
            }
        }

        System.out.println("Vowels : " + vowels);
        System.out.println("Consonants : " + consonants);
    }
}

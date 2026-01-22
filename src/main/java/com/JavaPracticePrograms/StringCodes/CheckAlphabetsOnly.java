package com.JavaPracticePrograms.StringCodes;

public class CheckAlphabetsOnly {

    public static void main(String[] args) {

        String str = "RiteshMalik";
        boolean isOnlyAlphabets = true;

        if (str == null || str.isEmpty()) {
            isOnlyAlphabets = false;
        } else {
            for (char c : str.toCharArray()) {
                if (!Character.isLetter(c)) {
                    isOnlyAlphabets = false;
                    break;
                }
            }
        }

        System.out.println("String contains only alphabets: " + isOnlyAlphabets);
    }
}


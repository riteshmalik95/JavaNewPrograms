package com.JavaPracticePrograms.StringCodes;

public class CheckDigitsOnly {
    public static void main(String[] args) {
        String s = "123456c";
        boolean isOnlyDigits = true;

        if (s == null || s.isEmpty()) {
            isOnlyDigits = false;
        } else {
            for (char c : s.toCharArray()) {
                if (!Character.isDigit(c)) {
                    isOnlyDigits = false;
                    break;
                }
            }
        }
        System.out.println("String contains only digits: " + isOnlyDigits);
    }
}

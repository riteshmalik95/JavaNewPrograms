package com.JavaPracticePrograms.StringCodes;

public class RemoveSpecialChars {

    public static void main(String[] args) {

        String str = "ABRA0*C#0DA#*0BBC";
        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (c != '0' && c != '*' && c != '#') {
                result.append(c);
            }
        }

        System.out.println("Original String : " + str);
        System.out.println("After Removing 0,*,# : " + result);
    }
}


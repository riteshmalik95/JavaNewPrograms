package com.JavaPracticePrograms.StringCodes;

public class RemoveRepeatedWithoutSet {

    public static void main(String[] args) {

        String str = "ABRACDABBC";
        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (result.indexOf(String.valueOf(c)) == -1) {
                result.append(c);
            }
        }

        System.out.println(result);
    }
}


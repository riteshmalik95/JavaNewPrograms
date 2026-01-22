package com.JavaPracticePrograms.StringCodes;

public class RemoveSpacesFromSentence {


    public static void main(String[] args) {

        String str = "i am ritesh";
        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (c != ' ') {
                result.append(c);
            }
        }

        System.out.println("Original String : " + str);
        System.out.println("After Removing Spaces : " + result);
    }
}


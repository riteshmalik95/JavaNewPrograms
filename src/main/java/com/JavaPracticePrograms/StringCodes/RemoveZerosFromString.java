package com.JavaPracticePrograms.StringCodes;
//Loop + StringBuilder
//⭐ BEST for interview
public class RemoveZerosFromString {

    public static void main(String[] args) {

        String str = "ABRA0C0DA0BBC";
        StringBuilder result = new StringBuilder();

        // Loop through each character
        for (char c : str.toCharArray()) {
            if (c != '0') {   // skip zero
                result.append(c);
            }
        }

        System.out.println("Original String : " + str);
        System.out.println("After Removing 0 : " + result);
    }
}


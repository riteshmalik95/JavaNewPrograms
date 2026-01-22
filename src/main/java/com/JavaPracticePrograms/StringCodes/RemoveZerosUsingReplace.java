package com.JavaPracticePrograms.StringCodes;

public class RemoveZerosUsingReplace {

    public static void main(String[] args) {

        String str = "ABRA0C0DA0BBC";

        String result = str.replace("0", "");

        System.out.println(result);
    }
}


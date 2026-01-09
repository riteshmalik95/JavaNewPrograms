package com.ritesh.javapractice.ArrayPrograms;

//Remove all spaces from a given string and print the resulting string.
public class JAVAArrayProblem2 {
    public static void main(String[] args) {
        String s = "i will definitely become an automation test engineer";
        String s1 = "";
        char[] arr = s.toCharArray();

        for (char c : arr) {
            if (c != ' ') {
                s1 = s1 + c;
            }
        }
        System.out.println(s1);
    }
}

package com.ritesh.javapractice.StringPrograms;

import java.util.Scanner;

public class AllPossibleCombinationOfString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        System.out.println("All possible combinations of the string : ");
        generateCombinations("", input);
        sc.close();
    }

    private static void generateCombinations(String prefix, String str) {
        if(!prefix.isEmpty()){
            System.out.println(prefix);
        }

        for(int i=0;i<str.length();i++){
            generateCombinations(prefix+str.charAt(i),str.substring(i+1));
        }

    }
}

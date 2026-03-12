package com.JavaPracticePrograms.StringCodes;

public class MakeFirstLetterCapital {
    public static void main(String[] args) {
        String input="my name is ritesh";
        String [] words=input.split(" ");
        String result="";

        for(String word:words){

            result=result+Character.toUpperCase(word.charAt(0))+word.substring(1)+" ";
        }
        System.out.println(result.trim());
    }
}

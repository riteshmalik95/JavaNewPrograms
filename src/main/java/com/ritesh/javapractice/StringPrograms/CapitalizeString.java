package com.ritesh.javapractice.StringPrograms;

public class CapitalizeString {
    public static void main(String[] args) {
        String toBeCapped="i will definitely become an automation test engineer";
        String[] tokens=toBeCapped.split(" ");
        toBeCapped="";

        for(int i=0;i<tokens.length;i++){
            char capLetter=Character.toUpperCase(tokens[i].charAt(0));
            toBeCapped=toBeCapped+" "+capLetter+tokens[i].substring(1);
        }
        toBeCapped=toBeCapped.trim();//it will remove the extra spaces from the starting of the String
        System.out.println(toBeCapped);
    }
}

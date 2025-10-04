package com.sumitsircodes.MySolutions;

public class CharacterOccurrence {
    public static void main(String[] args) {
        String str="I am software engineer";
        char ch='e';
        int count=0;

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==ch){
                count++;
            }
        }
        System.out.println("Character '"+ch+"' occurrs "+count+" times.");
    }
}

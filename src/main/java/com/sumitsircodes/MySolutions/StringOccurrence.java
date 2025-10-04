package com.sumitsircodes.MySolutions;

public class StringOccurrence {
    public static void main(String[] args) {
        String str="i am 'ritesh' who is doing coding in java, now i am good at java! and also java is best for Automation";
        String word="java";
        str = str.toLowerCase();
//  \\W means anything that is NOT a word character (spaces, commas, punctuation).
//This will properly separate "java," into "java".
        String [] arr=str.split("\\W+");
        int count=0;
        for(String s:arr){
            if(s.equals(word)){
                count++;
            }

        }
        System.out.println("String Occurrence '"+word+"'occurs "+count+" times.");
    }
}

package com.JavaPracticePrograms.ReverseStrings;
//Less efficient (String immutability)
public class CHAR_AT {
    public static void main(String[] args) {
        String s="Ritesh";
        String rev="";
        for (int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        System.out.println(rev);
    }
}

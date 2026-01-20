package com.JavaPracticePrograms.ReverseStrings;

public class UsingRecursion {
    public static void main(String[] args) {
        String s="Ritesh";
        String reversed=reverse(s);
        System.out.println("Original String : "+s);
        System.out.println("Reversed String : "+reversed);
    }


     public static String reverse(String s){
         if(s.isEmpty()){
             return s;
         }
         return(s.substring(1))+s.charAt(0);
     }
}

package com.ritesh.javapractice.StringPrograms;
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.HashMap;

class Main {
    public static void main(String[] args) {
        FindDuplicateWords("My Name is Ritesh Malik Malik Ritesh is Jaat and Jaat is best");

    }
    private static void FindDuplicateWords(String inputString){
        String[] words=inputString.split(" ");
        HashMap<String,Integer> wordcount=new HashMap<String,Integer>();
        for(String word:words){
            if(wordcount.containsKey(word.toLowerCase())){
                wordcount.put(word.toLowerCase(),wordcount.get(word.toLowerCase())+1);
            }else{ wordcount.put(word.toLowerCase(),1);

            }
        }
        System.out.println(wordcount);
        System.out.println("No of words in a string : " + words.length);
    }
}

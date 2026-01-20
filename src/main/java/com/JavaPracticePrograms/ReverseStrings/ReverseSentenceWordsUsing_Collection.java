package com.JavaPracticePrograms.ReverseStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseSentenceWordsUsing_Collection {
    public static void main(String[] args) {
        String str = "I love my India";

        //Split Sentence into words
        List<String> words=new ArrayList<>(Arrays.asList(str.split(" ")));

        //Reverse the List
        Collections.reverse(words);

        //join back to string
        String reversedstr=String.join(" ",words);

        System.out.println("original : "+str);
        System.out.println("Reversed : "+reversedstr);
    }
}

package com.JavaPracticePrograms.StringCodes;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveRepeatedCharacters {
    public static void main(String[] args) {
        String s="ABRACDABBC";

        Set<Character> set=new LinkedHashSet<>();

        // Add characters to set (duplicates are ignored)
        for(char c:s.toCharArray()){
            set.add(c);

        }
        // Build result string
        StringBuilder result = new StringBuilder();
        for (char c : set) {
            result.append(c);
        }

        System.out.println("Original String : " + s);
        System.out.println("After Removing Duplicates : " + result);
    }

}

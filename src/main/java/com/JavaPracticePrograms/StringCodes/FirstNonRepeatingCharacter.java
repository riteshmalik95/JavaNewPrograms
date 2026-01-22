package com.JavaPracticePrograms.StringCodes;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String s="assassination";

        Map<Character,Integer> map=new LinkedHashMap<>();

        //Count frequency of each character
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        //Find first non-repeating character
        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            if(entry.getValue()==1){
                System.out.print(entry.getKey()+" ");
                break;
            }
        }
    }
}


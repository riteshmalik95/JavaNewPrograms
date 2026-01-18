package com.ritesh.javapractice.StringPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountEachCharacter1 {
    public static void main(String[] args) {
        String s="ABRACDABBC";
        Map<Character,Integer> map=new LinkedHashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for (Map.Entry<Character,Integer> entry:map.entrySet()){
            System.out.print(entry.getKey()+""+entry.getValue()+" ");

        }
    }
}

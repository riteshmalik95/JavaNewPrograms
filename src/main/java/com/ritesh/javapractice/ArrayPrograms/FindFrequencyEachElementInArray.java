package com.ritesh.javapractice.ArrayPrograms;

import java.util.HashMap;
import java.util.Map;

public class FindFrequencyEachElementInArray {
    public static void main(String[] args) {
        String []names={"Sachin","James","Mohan","Neha","Sachin","James","Pratap"};
        HashMap<String,Integer> nameAnditsFrequency=fnFindFrequencyOfElementArray(names);
        for(Map.Entry<String,Integer> entry:nameAnditsFrequency.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
            System.out.println();
        }
    }

    private static HashMap<String, Integer> fnFindFrequencyOfElementArray(String[] names) {
        HashMap<String, Integer> map = new HashMap<>();
         for(int i=0;i<names.length;i++){
             if(map.containsKey(names[i])){
                 map.put(names[i],map.get(names[i])+1);
             }else {
                 map.put(names[i],1);
             }
         }
        return map;
    }
}

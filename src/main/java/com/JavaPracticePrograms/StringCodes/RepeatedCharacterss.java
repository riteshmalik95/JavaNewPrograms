package com.JavaPracticePrograms.StringCodes;
import java.util.LinkedHashMap;
import java.util.Map;
public class RepeatedCharacterss {
    public static void main(String[] args) {
        String str="ABBBCCCCDDABABCCDDDEE";
        Map <Character,Integer> map=new LinkedHashMap<>();

        //Count Frequency of each Character
        for(char c:str.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);

            }
        // Print characters repeated more than twice
        for(Map.Entry <Character,Integer> entry :map.entrySet()){
            if(entry.getValue()>2){
                System.out.print(entry.getKey());
//                System.out.print(entry.getKey()+""+entry.getValue()+" ");
            }
        }
    }
}

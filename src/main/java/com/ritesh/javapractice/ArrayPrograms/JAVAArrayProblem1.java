package com.ritesh.javapractice.ArrayPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class JAVAArrayProblem1 {
    public static void main(String[] args) {
        String s = "I am An Automation Engineer";
        String s1 = s.toLowerCase();
        char[] goal = s1.toCharArray();
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char c : goal) {
            if (c != ' ') {
                if (map.containsKey(c)) {
                    map.put(c, map.get(c) + 1);
                } else {
                    map.put(c, 1);
                }
            }
        }
        for (Map.Entry<Character, Integer> mp : map.entrySet()) {
            System.out.println("Key is : " + mp.getKey() + " and value is : " + mp.getValue());
        }

    }
}

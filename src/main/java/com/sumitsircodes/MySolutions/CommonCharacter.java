package com.sumitsircodes.MySolutions;

import java.util.LinkedHashSet;
import java.util.Set;

public class CommonCharacter {
    public static void main(String[] args) {
        String str1 = "Programming";
        String str2 = "gaming";
        Set<Character> common = new LinkedHashSet<>(); // preserves order & no duplicates

        System.out.println("Common Characters:");
        for (int i = 0; i < str1.length(); i++) {
            char ch1 = Character.toLowerCase(str1.charAt(i));
            for (int j = 0; j < str2.length(); j++) {
                char ch2 = Character.toLowerCase(str2.charAt(j));
                if (ch1 == ch2) {
                    common.add(ch2);        // ✅ Add only when match
                    System.out.println(ch2); // ✅ Print only when match
                    break;                  // ✅ Exit inner loop for this ch1
                }
            }
        }

        System.out.println("\nUnique Common Characters: " + common);
    }
}

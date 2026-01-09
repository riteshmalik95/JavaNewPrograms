package com.ritesh.javapractice.ArrayPrograms;

public class FindMaxOnesInString {
    public static void main(String[] args) {
        String str = "11011101111";
        int result = findMax1s(str);
        System.out.println("Maximum consecutive 1s: " + result);
    }

    private static int findMax1s(String str) {
        int maxCount = 0;
        int currentCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1') {
                currentCount++;
                maxCount = Math.max(maxCount, currentCount);
            } else {
                currentCount = 0;
            }

        }
        return maxCount;
    }
}

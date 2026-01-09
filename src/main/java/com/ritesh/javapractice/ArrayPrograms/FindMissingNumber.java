package com.ritesh.javapractice.ArrayPrograms;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 6};
        System.out.println("Initial length of an Array: " + numbers.length);
        int n = numbers.length + 1;
        System.out.println("Expected Length of an Array: " + n);
        int sum = 0;
        for (int i = 0; i < n - 1; i++) {
            sum = sum + numbers[i];
        }
        int expectedSum = (n * (n + 1)) / 2;
        int missingNum = expectedSum - sum;

        System.out.println(missingNum);

    }
}

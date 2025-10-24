package com.sumitsircodes.MySolutions;

public class StringValidation {
    public static void main(String[] args) {
        String input = "  Java Programming  ";

        // Trim spaces
        input = input.trim();

        // Convert to lowercase
        input = input.toLowerCase();

        // Replace multiple spaces with single space
        input = input.replaceAll("\\s+", " ");

        System.out.println("Validated String: " + input);
    }
}


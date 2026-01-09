package com.ritesh.javapractice.ArrayPrograms;
//Without Set (Order Preserved): [5, 2, 6, 8, 7, 4]
//With HashSet (No Order Guarantee): [2, 4, 5, 6, 7, 8]

import java.util.*;

public class RemoveDuplicateFromAnArray {

    public static void main(String[] args) {

        int[] a = {5, 2, 6, 8, 6, 7, 5, 2, 4};

        int[] arrWithoutSet = removeDuplicatesFromArrayWithoutSet(a);
        int[] arrWithSet = removeDuplicatesFromArrayWithHashSet(a);

        System.out.println("Without Set (Order Preserved): " + Arrays.toString(arrWithoutSet));
        System.out.println("With HashSet (No Order Guarantee): " + Arrays.toString(arrWithSet));
    }

    // ❌ Without Set (O(n²))
    private static int[] removeDuplicatesFromArrayWithoutSet(int[] a) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int element : a) {
            if (!list.contains(element)) {
                list.add(element);
            }
        }

        int[] result = new int[list.size()];
        int i = 0;

        for (int value : list) {
            result[i++] = value;
        }

        return result;
    }

    // ✅ With HashSet (O(n))
    private static int[] removeDuplicatesFromArrayWithHashSet(int[] a) {

        HashSet<Integer> set = new HashSet<>();

        for (int value : a) {
            set.add(value);
        }

        int[] result = new int[set.size()];
        int i = 0;

        for (int value : set) {
            result[i++] = value;
        }

        return result;
    }
}

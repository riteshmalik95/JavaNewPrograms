package com.ritesh.javapractice.ArrayPrograms;
//Find Common Elements in Two Arrays
/*Typical Logic:
        -Store elements of the first array in a Set or Map
        -Traverse the second array
        -If an element exists in the set → it’s common

        "You are comparing two different arrays"
        */

import java.util.HashSet;
import java.util.Set;

public class FindCommonElementsInTwoArrays {
    public static void main(String[] args) {

        int[] a1 = {12, 25, 33, 39, 45};
        int[] a2 = {22, 55, 33, 39, 65};

        Set<Integer> set = returnCommonItemsArray(a1, a2);

        System.out.println("Common elements in two arrays are : " + set);


    }

    private static Set<Integer> returnCommonItemsArray(int[] a1, int[] a2) {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();

        for (int n : a1) {
            s1.add(n);
        }

        for (int n : a2) {
            s2.add(n);
        }
        s1.retainAll(s2);


        return s1;
    }
}

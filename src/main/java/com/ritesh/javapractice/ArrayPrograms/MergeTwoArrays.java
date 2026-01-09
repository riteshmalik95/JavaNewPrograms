package com.ritesh.javapractice.ArrayPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int[] a1 = {12, 19, 22, 28, 30};
        int[] a2 = {32, 39, 42, 48};
        int[] r = mergeArray(a1, a2);
        System.out.println(Arrays.toString(r));

    }

    private static int[] mergeArray(int[] a1, int[] a2) {
        List<Integer> list = new ArrayList<>();

        for (int n : a1) {
            list.add(n);
        }
        for (int n : a2) {
            list.add(n);
        }
        int[] result = new int[list.size()];
        Collections.sort(list);
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}

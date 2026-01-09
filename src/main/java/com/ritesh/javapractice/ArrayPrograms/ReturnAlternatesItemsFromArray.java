package com.ritesh.javapractice.ArrayPrograms;

import java.util.ArrayList;
import java.util.List;

public class ReturnAlternatesItemsFromArray {
    public static void main(String[] args) {
        int[] a = {12, 26, 29, 35, 56};
        List<Integer> list = new ArrayList<>();
        System.out.println(list.size());
        for (int i = 0; i < a.length; i += 2) {
            list.add(a[i]);
        }
        System.out.println(list);
        System.out.println(list.size());
    }
}

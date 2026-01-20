package com.JavaPracticePrograms.ReverseStrings;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr={1,5,1,6,9,8,6,5};
        Set<Integer> set=new LinkedHashSet<>();
        for(int i:arr){
            set.add(i);
        }
        System.out.println(set);
    }
}

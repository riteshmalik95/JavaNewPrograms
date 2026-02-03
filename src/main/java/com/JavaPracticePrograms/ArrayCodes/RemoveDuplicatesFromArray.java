package com.JavaPracticePrograms.ArrayCodes;
import java.util.Set;
import java.util.LinkedHashSet;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,6,1,7,2,9,6};

        Set<Integer> set=new LinkedHashSet<>();

        for (int i:arr){
            set.add(i);
        }
        System.out.println(set);
    }
}

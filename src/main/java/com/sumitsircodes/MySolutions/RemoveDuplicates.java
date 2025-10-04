package com.sumitsircodes.MySolutions;

import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int [] arr={13,15,25,13,35,15,62,25};
        LinkedHashSet<Integer> set=new LinkedHashSet<>();
        for(int num:arr){
            set.add(num);
        }
        System.out.println("Array after removing duplicates"+set);
    }
}

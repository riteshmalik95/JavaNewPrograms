package com.ritesh.javapractice.ArrayPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortArrayUsingInbuiltMethod {
    public static void main(String[] args) {
        int[] marks = { 45, 33, 22, 89, 67, 44 };

        List<Integer> li=new ArrayList<>();

        for(int n:marks){
            li.add(n);
        }
        Collections.sort(li);

        System.out.println("List is :"+li);

        int[] result=new int[li.size()];

        for(int i=0;i<li.size();i++){
            result[i]=li.get(i);
        }
        System.out.println("Array is : " + Arrays.toString(result));


    }
}

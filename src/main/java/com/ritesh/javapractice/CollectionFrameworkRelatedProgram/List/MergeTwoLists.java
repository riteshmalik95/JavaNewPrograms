package com.ritesh.javapractice.CollectionFrameworkRelatedProgram.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoLists {
    public static void main(String[] args) {
        List<String> list1=new ArrayList<>(Arrays.asList("Java","Python","Ruby"));
        List<String> list2=new ArrayList<>(Arrays.asList("C++","JavaScript"));
        list1.addAll(list2);
        System.out.println("Merged List"+list1);
    }
}

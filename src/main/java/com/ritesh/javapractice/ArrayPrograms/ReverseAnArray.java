package com.ritesh.javapractice.ArrayPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ReverseAnArray {
    public static void main(String[] args) {

        int[] marks = {10, 15, 19, 22, 40, 57};

        List<Integer> list = new ArrayList<>();

        Stack<Integer> stack = new Stack<Integer>();

        for (int n : marks) {

            stack.push(n);
        }
        System.out.println("Array before reverse : " + stack);

        while (!stack.isEmpty()) {

            list.add(stack.pop());
        }
        System.out.println("Array after reverse : " + list);
    }
}

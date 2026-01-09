package com.ritesh.javapractice.CollectionFrameworkRelatedProgram.List;

import java.util.Arrays;
import java.util.List;
/*
List.of() creates an immutable list, so any modification operation such as add(), remove(), or set()
will fail at runtime and throw an UnsupportedOperationException. The list does not allow changing its
size or modifying existing elements, and it also does not permit null values. Because of this strict
immutability, List.of() is mainly used when a fixed, read-only list is required.
Arrays.asList() creates a fixed-size list backed by the original array, so add() and remove() operations
will fail and throw an UnsupportedOperationException, because they attempt to change the list size.
However, set() is allowed, since it only replaces an existing element without modifying the size of the list.
*/
public class ListOfVsAsList {
    public static void main(String[] args) {
        String [] colors={"Red","Green","Blue","Black","White"};

//        List<String> listColors=List.of(colors);
        List<String> listColors= Arrays.asList(colors);
//        listColors.add("Grey");
        listColors.set(1,"yellow");
//        listColors.remove(0);

        System.out.println(listColors);


    }
}

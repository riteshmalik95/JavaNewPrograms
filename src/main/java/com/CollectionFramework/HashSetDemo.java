package com.CollectionFramework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;


public class HashSetDemo {
    public static void main(String[] args) {
        HashSet set1=new HashSet();
        // Set set2=new HashSet<>();//it is correct - here we are storing child class object to parent class
        // variable.
        // HashSet<String> hs=new HashSet<String>();//correct
        set1.add("Ritesh Automation Engineer");
        set1.add(100);
        set1.add(100);
        set1.add(null);
        set1.add(null);
        set1.add('A');
        set1.add(false);
        set1.add(false);
        set1.add(true);

        System.out.println(set1);
        //Removing an Element-We can remove by using value not by an index...because indexing is not possible
        set1.remove(100);
        System.out.println(set1);
        //Inserting an Element-not possible
        //Access Specific Element is not possible  (but possible by conversion)

        //Convert HashSet---->ArrayList
        ArrayList a1=new ArrayList(set1);
        System.out.println(a1);
        System.out.println(a1.get(4));

        //Read all the values by using normal for loop from the HashSet is not possible
        //Read all the values by using for___each loop is possible
        for(Object x:set1){
            System.out.println(x);
        }
        // We can also use Iterator Here
        Iterator it1=set1.iterator();
        while (it1.hasNext()){
            System.out.println(it1.next());
        }
        //Clearing all the values in the HashSet
        set1.clear();
        System.out.println(set1.isEmpty());


    }
}

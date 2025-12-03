package com.CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {

//        ArrayList<String> fruits= new ArrayList<>();
//        //Adding elements to the ArrayList
//        fruits.add(0,"Apple");
//        fruits.add(1,"Banana");
//        fruits.add(2,"Grapes");
//        //Access Elements
//        System.out.println(fruits.get(0));
//        //update an element
//        fruits.set(1,"orange");
//        System.out.println(fruits);
//        //find the size of the ArrayList
//        System.out.println(fruits.size());
//        //Remove an element
//        System.out.println(fruits.remove(2));
//        System.out.println(fruits);
//        boolean hasgrapes=fruits.contains("Grapes");
//        System.out.println(hasgrapes);

        //In this,we can add heterogeneous type of data
        ArrayList myList=new ArrayList();
        myList.add(true);
        myList.add("welcome");
        myList.add(10.5);
        myList.add(false);
        myList.add(null);
        myList.add(null);
        myList.add('A');
        myList.add(50);
        myList.add(50);
        System.out.println(myList.size());
        System.out.println(myList);
        myList.add(5,20);
        System.out.println(myList);
        // if I want to read all values then we have to use for loop
        for (int i=0;i<myList.size();i++){
            System.out.println(myList.get(i));
        }
        //Enhanced for loop-for each loop
        for (Object x:myList)
            System.out.println(x);

        //We can also use iterator for reading the values from the Arraylist Collection
        Iterator it=myList.iterator();

        //hasNext()-it will check the data is present or not
        while (it.hasNext()){
            System.out.println(it.next());
        }
        //Iterator<Object> it1=myList.iterator();
//        Iterator<String> it1=myList.iterator();

//     Checking Arraylist is Empty or not
        System.out.println(myList.isEmpty());

        // for removing the multiple elements in a single shot then we have to create a spare array list
        ArrayList myList2=new ArrayList();
        myList2.add(50);
        myList2.add(50);
        myList2.add('A');
        myList.removeAll(myList2);
        System.out.println(myList);

        //for removing/clear all the elements
        myList.clear();
        System.out.println(myList.isEmpty());



    }
}

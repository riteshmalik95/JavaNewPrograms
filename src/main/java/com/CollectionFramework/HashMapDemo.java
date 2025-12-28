package com.CollectionFramework;
//Developed by Ritesh Automation Tester
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
         //Declaration part
//        HashMap hm=new HashMap();
//        Map hm1=new HashMap();
        HashMap<Integer,String> hm2=new HashMap<Integer,String>();

        //Adding Pairs
        hm2.put(101,"Ritesh Malik");
        hm2.put(102,"Rahul Pandey");
        hm2.put(103,"Aman chauhan");
        hm2.put(104,"Ritesh Malik");
        hm2.put(105,"Amit Mishra");
        hm2.put(102,"Manish Pandey");//Duplicate key is not allowed but old value is replaced by new value.
        System.out.println(hm2);
        System.out.println("Size of Hashmap: "+hm2.size());
        // Removing the pairs
        hm2.remove(105);
        System.out.println(hm2);

        //Retrieving/Accessing the value of the key
        System.out.println(hm2.get(102));

        //Getting all the values of the key
        System.out.println(hm2.keySet());

        //Getting all the values from the hashmap
        System.out.println(hm2.values());

        //Getting all the keys and values both from the hashmap
        System.out.println(hm2.entrySet());

        //Update the values of the keys
        hm2.put(103,"Aman Malik");
        System.out.println(hm2);

        // getOrDefault(key, defaultValue) returns the value for the given key.
        // If the key does NOT exist in the map, it returns the defaultValue instead of null.
        System.out.println(hm2.getOrDefault(106,"My name is Ritesh"));

        // putIfAbsent(key, value) adds the key-value only if the key is not already in the map.
        hm2.putIfAbsent(106,"someone");
        String value=hm2.get(106);
        System.out.println(value);
        System.out.println(hm2);
        //getOrDefault()-Reads value (does NOT insert anything)
        //putIfAbsent()-Inserts value only if key is missing

        //computes + inserts a value using a function
        hm2.computeIfAbsent(107, k -> "Generated Default Value");
        System.out.println(hm2.get(107));
        System.out.println("------------------------");

        //How to read the data from the HashMap
        //1)Using Normal for each loop-not possible(Insertion order is not preserved)
        //2)Enhanced-for each-loop
        for(Object k:hm2.keySet()){
            System.out.println(k+" "+hm2.get(k));// Getting all values one by one
        }
        System.out.println("-------------------");
        System.out.println(hm2);
        System.out.println("---------------------");

        //By using Iterator
        Iterator<Map.Entry<Integer, String>> it = hm2.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry<Integer, String> entry=it.next();
            System.out.println(entry.getKey()+"  "+entry.getValue());
        }
        //Clearing all things from HashMap
        hm2.clear();
        System.out.println(hm2.isEmpty());

    }
}

package com.OOPsConceptJava.Polymorphism;

public class AdderMain {
    public static void main(String[] args) {
        AdderDemo obj=new AdderDemo();
        obj.sum();
        obj.sum(10,40);
        obj.sum(50,70.75);
        obj.sum(120.56,42);
        obj.sum(10,25,75);
    }
}

package com.OOPsConceptJava.Inheritance;
//Java class concept does not support "Multiple Inheritance"
class X{
//we still have not created any method in this class(X)-but still it has so many methods which
//are coming or acquiring from root class i.e. Object class
//so every java class has so many common methods even after if we have not created some common methods
//between these classes then java class will definitely face an Ambiguity Problem while extending
//a single child class from two or more parent classes.........
}
public class ObjectClassTest {
    public static void main(String[] args) {
        X obj=new X();
    }
}

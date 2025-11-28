package com.OOPsConceptJava.DataAbstraction;

abstract class Subjects{
    int lectureCount = 20;          // instance variable
    static String department = "Science"; // static variable
    final String code = "SUB001";   // final variable
    static final double VERSION = 1.0; // static final variable
//    abstract int x;// not allowed
    abstract void syllabus();
    public abstract void books();

    public static void rubber() {

    }

    final void name() {

    }

    void lectures() {

    }
}
public class AbstractClassDemo {
    public static void main(String[] args) {

    }
}

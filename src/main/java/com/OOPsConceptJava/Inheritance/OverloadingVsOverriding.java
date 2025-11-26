package com.OOPsConceptJava.Inheritance;
//Without inheritance, we can not achieve Overriding
//We can not achieve overriding via single class, we must have at least two classes
//Without inheritance we can easily achieve Overloading via creating multiple methods with the same
//name in a single class or multiple classes....

class ABC{
    void m1(int a){
        System.out.println(a);
    }
    void m2(int b){
        System.out.println(b);
    }
}
class XYZ extends ABC{
    //Override Method will always be executed....
    void m1(int a){//Overriding
        System.out.println(a*a);
    }
    void m2(int a,int b){
        System.out.println(a+b);//Overloading
        //Total 3 methods in XYZ
    }
}
public class OverloadingVsOverriding {
    public static void main(String[] args) {
        XYZ obj1=new XYZ();
        //new implementation will be executed.
        obj1.m1(10);
        obj1.m2(10,20);
        obj1.m2(15);

        ABC ab=new ABC();
        //Old implementation will be executed.
    }
}

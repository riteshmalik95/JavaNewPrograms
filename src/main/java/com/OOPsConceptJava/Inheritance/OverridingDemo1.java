package com.OOPsConceptJava.Inheritance;
//Another use of super keyword
class ParentClass{

    int x=100;
    void m1(){
        System.out.println(x);
    }
    void eat(){
        System.out.println("Eating........");
    }
}
class ChildClass extends ParentClass{
    //Even after overriding I still want to get old value,for getting old value we have
    //to use super keyword--- super.x;
    int x=200;
    void m1(){
        System.out.println(super.x);

    }
    void eat(){
//        System.out.println("Eating Bread........");
        super.eat();
    }
}
public class OverridingDemo1 {
    public static void main(String[] args) {
        ChildClass ch=new ChildClass();
//        System.out.println(ch.x);
        ch.m1();
//        ch.eat();
          ch.eat();
//        ParentClass p=new ParentClass();
//        System.out.println(p.x);
//        p.m1();


    }
}

package com.OOPsConceptJava.Inheritance;
//MultiLevel Inheritance
class A1 {
    int a ;
    void display() {
        System.out.println(a);
    }
}
class B1 extends A {
    int b;
    void show() {
        System.out.println(b);
    }
}
class C1 extends B1 {
    int c;
    void present() {
        System.out.println(c);
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        C1 cobj = new C1();
        //instead of hard coding the data I will assign through object
        cobj.a=100;
        cobj.b=200;
        cobj.c=300;
        System.out.println(cobj.a);
        System.out.println(cobj.b);
        System.out.println(cobj.c);
        cobj.display();
        cobj.show();
        cobj.present();
    }
}


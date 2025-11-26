package com.OOPsConceptJava.Inheritance;
//HierarchyInheritance-One parent can have a more than one child.
class parent{
    void display(int a){
        System.out.println(a);
    }
}
class child1 extends parent{
    void show(int b){
        System.out.println(b);
    }
}
class child2 extends parent{
    void greet(String str){
        System.out.println(str);
    }
}
public class HierarchyInheritance {
    public static void main(String[] args) {
        child1 ch1=new child1();
        ch1.show(200);
        ch1.display(100);
        child2 ch2=new child2();
        ch2.greet("Hi ! Ritesh Malik");
        ch2.display(1000);
    }
}

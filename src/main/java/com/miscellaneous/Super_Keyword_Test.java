package com.miscellaneous;
//If a subclass constructor does not explicitly call super() or this(), the Java compiler
//automatically inserts a call to the superclass's no-argument constructor.
//You cannot use both this() and super() in the same constructor because both must be the first statement.
//super cannot be used in a static context (static variables, methods, or blocks) because it
//refers to an instance of a parent class or super is tied to objects, not classes. Static methods
//don't belong to objects.
//You can use super.method() or super.variable anywhere inside a normal method.
//void display() {
//    System.out.println("Start");
//    super.show();   // can be anywhere
//    System.out.println("End");
//}


class Animal{
    String type="Animal";

    Animal(){
        System.out.println("Animal Constructor Called");
    }
    void displayType(){
        System.out.println("Type:"+type);
    }
}
class Dog extends Animal{
    String type="Mammal";
    Dog(){
//        super();
        System.out.println("Dog Constructor Called");
    }
    void displayType(){
        System.out.println("Dog's type:"+type);
//        System.out.println("Animal's Type:"+super.type);
//        super.displayType();
    }
}
public class Super_Keyword_Test {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.displayType();
    }
}

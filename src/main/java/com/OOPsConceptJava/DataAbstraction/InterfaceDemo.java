package com.OOPsConceptJava.DataAbstraction;
//Interface can allow three types of methods-1)Abstract Method(Without Implementation),2)default method
//(with implementation) and 3)static method(with implementation)
interface Shape{
    int length=10;//by default final and static
    int width=20;//by default final and static

    void circle();//Abstract methods

    //Default Method
    default void square(){
        System.out.println("This is a Square- default method");
    }
    //Static Method
    static void rectangle(){
        System.out.println("This is a rectangle-static method");
    }

}
public class InterfaceDemo implements Shape
   {
       public void circle(){
           System.out.println("This is circle-Abstract Method");
       }

    public static void main(String[] args) {
           //Scenario-1
//        InterfaceDemo id=new InterfaceDemo();
//        id.circle();//abstract
//        id.square();//default
//        Shape.rectangle();//Static Method can directly access from Interface.
          //Scenario-2
        Shape s=new InterfaceDemo();
        s.circle();//abstract
        s.square();//default
        Shape.rectangle();
        System.out.println(Shape.length*Shape.width);
    }
}

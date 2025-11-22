package com.miscellaneous;
//Static keyword-We can apply static keyword for the both the variables and the methods.
//There are four different types of Variables and Methods
//static variables
//static methods
//non-static variables
//non-static methods
//here you can also get to know about microscopic details about main method and println() method-
//you can get this at the last position of actual code........

public class StaticKeyword {
    static int a=20;
    int b=40;

    static void m1(){  //static
        System.out.println("This is m1 static method");
    }

    void m2(){  //non-static
        System.out.println("This is m2 non-static method");
    }

    void m(){
        //Non-Static Methods can access everything directly
        System.out.println(a);
        System.out.println(b);
        m1();
        m2();
    }

    public static void main(String[] args) {
//        System.out.println(a);//no need to create an object becoz variable is static
//        //Static methods can access static stuff directly(without object)
//        m1();//no need to create an object becoz method is static
//        StaticKeyword.m1();//classname.methodname;//no need to create an object becoz method is static
        StaticKeyword sk=new StaticKeyword();
        //Static methods can access non-static stuff through object
//        System.out.println(sk.b);
//        sk.m2();
        sk.m();


//if you want to separate this main method in another class then you can not directly access static stuff
//then you have to use like- classname.methodname and classname.variablename...........
    }
}

//class test{
//    static String s="welcome";
//
//}
//how access and find the length of the String - test.s.length()


//class System{
//    static PrintStream out;
//}
// how to access out variable- System.out.println()
//System is a pre-defined class in java,out is a static variable and println() is method
//which is a part of Print Stream class....

/*
public static void main(String[] args){ // Valid Case

}
 */
/*
static public void main(String[] args){ // Valid Case

}
 */
/*
public void static main(String args[]){ // Invalid Case// Must be void main-
 void should come always before main

}
 */
/*
void main(String[] args) public static { // Invalid Case

}
 */

/*
public static void main(int a[]){ // Valid Case
JVM will not look for this method it is just a normal method- it is a overloaded method.

}
 */
/*
static public void main(String a[]){ // Valid Case
JVM will definitely look for this method which is a real main method......

}
 */

//public-so main method is accessible everywhere in a project.
//static-means main method is common across all the classes and all objects.
//void-main method does not return any value.
//String[] args-main method can take array as an arguments that is command line arguments and these are
//String Array type of Arguments/Parameters.From where we will pass these parameters-through command line so
//it is called as Command Line Arguments.
//args is a variable & in place of args,you can use x,y,z either......
//Java Virtual Machine(JVM) is responsible for the execution of your program and jvm always looks
//for the main method to control the flow of Execution.......

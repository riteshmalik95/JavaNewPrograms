package com.ritesh.javapractice.ClassesAndObjects;
/*
In Java, when a program starts, the static block is executed first and it runs only once at the time of class
loading by the JVM, even before the main method is called. After the class is loaded and all static blocks are
executed, the JVM invokes the main method, which acts as the entry point of the program. Inside the main method,
whenever an object of the class is created using the new keyword, the instance initialization block is executed
every time before the constructor. Immediately after the instance block, the constructor is executed, which is
responsible for initializing the object. This sequence—instance block followed by constructor—repeats for each
object created, while the static block never executes again during the program’s lifetime.
*/
public class ExeSequenceOfBlocks {

    static {
        System.out.println("Static Block");
    }
    {
        System.out.println("Instance Block");
    }
    public ExeSequenceOfBlocks(){
        System.out.println("Constructor Block");
    }
    public static void main(String[] args) {
        new ExeSequenceOfBlocks();
        new ExeSequenceOfBlocks();
    }
}

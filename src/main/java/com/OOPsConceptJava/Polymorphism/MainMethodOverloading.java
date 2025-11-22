package com.OOPsConceptJava.Polymorphism;
//Yes, we can overload the main method in Java.
public class MainMethodOverloading {

    void main(int x){
        System.out.println(x);
    }

    void main(String s){
        System.out.println(s);
    }

    void main(String s1,String s2){
        System.out.println(s1+s2);
    }

    public static void main(String[] args) {
        //String[] args- String Array type of Arguments/Parameters
        //From where we will pass these parameters-through command line so it is called as Command Line
        //Arguments
        MainMethodOverloading ov=new MainMethodOverloading();
        ov.main(10);
        ov.main("Software Engineer Ritesh Malik");
        ov.main("Automation"," Tester");



    }
}

package com.miscellaneous;

public class FunctionDemo {
    //Function that can add two numbers
    public int add(int a,int b){
        return a+b;
    }
    //this function will print a message
    public void greet(String name){
        System.out.println("Hello, "+ name +"!");
    }

    //this function will return the square of a number
    public int square(int num){

        return num*num;
    }

    public static void main(String[] args) {
        FunctionDemo fd=new FunctionDemo();
        int sum=fd.add(25,35);
        System.out.println("Sum= "+sum);

        fd.greet("Amit");

        int result=fd.square(5);
        System.out.println("Square= "+result);

    }
}

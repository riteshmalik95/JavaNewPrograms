package com.miscellaneous;
//Class and Objects Demo
public class Employee {
    //Class Variables-That can access anywhere in the class
    int empid;
    String empname;
    float empsal;
    String job;
    Employee(){
        System.out.println("Default Constructor is called");
    }

    void display(){
        System.out.println(empid);
        System.out.println(empname);
        System.out.println(empsal);
        System.out.println(job);
    }

    public static void main(String[] args) {
        //All objects are of Employee type instead of this, they are independent.
        Employee e1=new Employee();
        e1.empid=101;
        e1.empname="Aman Chauhan";
        e1.empsal= 50000.00F;
        e1.job="Automation tester";
        e1.display();
        Employee e2=new Employee();
        e2.empid=102;
        e2.empname="Rahul Desai";
        e2.empsal= 55000.00F;
        e2.job="Test Lead";
        e2.display();
        System.out.println("...............");
        // If we had not created the display() method then we can print and access the values
        //directly by using variable name in print statement
        System.out.println(e1.empid);
        System.out.println(e1.empname);
        System.out.println(e1.empsal);
        System.out.println(e1.job);
        System.out.println("--------------");
        System.out.println(e2.empid);
        System.out.println(e2.empname);
        System.out.println(e2.empsal);
        System.out.println(e2.job);



    }
}

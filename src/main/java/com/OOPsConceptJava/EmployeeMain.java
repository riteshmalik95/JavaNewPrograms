package com.OOPsConceptJava;
//Currently EmployeeWithoutMain class is in same package, if this class was in
//another package then how would we access it--- import packagename.classname;
public class EmployeeMain {
    public static void main(String[] args) {
        //All objects are of Employee type instead of this, they are independent.
        EmployeeWithoutMain e1= new EmployeeWithoutMain();
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

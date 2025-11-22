package com.OOPsConceptJava.Encapsulation;
//It is more over like a security kind of feature.
//Encapsulation- This concept allows to bind/wrapping up of data members(variables) and methods(functions)
//into a single unit(or class)
//To achieve the Encapsulation- (1)We have to make all the variables "private"
//(2)For every variable, we have to create two methods-(a) Setter Methods-Setting the value into variable.
//(b) Getter Methods-Getting the value or to read the data from the variable.
//When we use class variable name and local variable name same then we can differentiate with the help of
//'this' keyword
//'this' is always representing the class/object
//Refer to instance variables
//Call another constructor in the same class
//Pass the current object as a parameter
//Return the current object
//it is commonly used to refer to the current object’s instance variables
//(which are usually the class-level fields).
public class Account {
    //Class Variables
    private int accno;
    private String name;
    private double amnt;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        //local variable
        //'this' is always representing the class-this.name(class level variable)-which belongs to the class
        //name- it's a local variable.
        this.name = name;
    }

    public double getAmnt() {
        return amnt;
    }

    public void setAmnt(double amnt) {
        this.amnt = amnt;
    }

    public int getAccno() {
        return accno;
    }

    public void setAccno(int accno) {
        //Local Variable
        this.accno = accno;
    }
}
//Default Value of a Integer Variable is zero.
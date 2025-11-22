package com.OOPsConceptJava.Encapsulation;

public class AccountMain {
    public static void main(String[] args) {
        Account acc=new Account();
        acc.setAccno(101);
        acc.setAmnt(50000.00);
        acc.setName("Ritesh Malik");
        System.out.println( acc.getAccno()+"  "+ acc.getAmnt()+"  "+acc.getName());

    }
}

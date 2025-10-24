package com.sumitsircodes.MySolutions;
//Encapsulation for Data Hiding
class Account {
    private double balance;  // private = hidden data

    public Account(double balance) {
        this.balance = balance;
    }

    // getter
    public double getBalance() {
        return balance;
    }

    // setter
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount");
        }
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        Account acc = new Account(1000);
        System.out.println("Initial Balance: " + acc.getBalance());
        acc.deposit(500);
        acc.withdraw(300);
        System.out.println("Final Balance: " + acc.getBalance());
    }
}

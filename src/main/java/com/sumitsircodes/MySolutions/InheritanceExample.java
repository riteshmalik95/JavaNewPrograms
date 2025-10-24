package com.sumitsircodes.MySolutions;

//Inheritance and Polymorphism for Test Framework Design

// Base Test Class
class BaseTest {
    public void setup() {
        System.out.println("Setup before test");
    }

    public void teardown() {
        System.out.println("Teardown after test");
    }
}

// Module-specific test class (Inheritance + Polymorphism)
class LoginTest extends BaseTest {
    @Override
    public void setup() {
        super.setup();
        System.out.println("LoginTest specific setup");
    }

    @Override
    public void teardown() {
        System.out.println("LoginTest specific teardown");
        super.teardown();
    }

    public void runTest() {
        System.out.println("Executing Login Test...");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        BaseTest test = new LoginTest();  // Polymorphism
        test.setup();
        ((LoginTest) test).runTest();
        test.teardown();
    }
}

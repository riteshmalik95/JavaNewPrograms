package com.miscellaneous;
class Test{
    final int x=100;
}
public class FinalKeyword {
    public static void main(String[] args) {
        Test fk=new Test();
//        fk.x=200;// incorrect , error
        System.out.println(fk.x);
    }
}

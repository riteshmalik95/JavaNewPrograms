package com.miscellaneous;

public class StaticDemo1 {
    static int count=0;

    StaticDemo1(){
        count++;
    }
    static void showCount(){
        System.out.println(count);
    }

    public static void main(String[] args) {
       new StaticDemo1();
        new StaticDemo1();

       StaticDemo1.showCount();
    }
}

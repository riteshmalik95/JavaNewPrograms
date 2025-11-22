package com.miscellaneous;

public class StaticDemo {
    static int a=8;
    int b=10;
    int d;//here,choice is yours,you can initialize or not,if you don't initialize then it will be
    //taken care by JVM itself and will give default value is zero(0)

    static void test(){
        System.out.println(a);
//      System.out.println(b);
    }

    void getData(){
        System.out.println(a);
        System.out.println(b);
//      int c;//You can't leave local variable without initialization(Must be initialize)
//      here,there is no default value.
//      System.out.println(c);
        int c=45;
        System.out.println(c);
    }

    public static void main(String[] args) {
        StaticDemo sd=new StaticDemo();
//        System.out.println(a);
//        System.out.println(sd.b);
//        test();
          sd.getData();

    }
}

package com.miscellaneous;

public class ChildAccessModifier extends AccessModifiers{
    public static void main(String[] args) {
        ChildAccessModifier cam=new ChildAccessModifier();
        cam.m1();
        System.out.println(cam.a);
    }
}

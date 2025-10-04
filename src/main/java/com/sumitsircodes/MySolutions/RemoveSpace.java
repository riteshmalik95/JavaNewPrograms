package com.sumitsircodes.MySolutions;

public class RemoveSpace {
    public static void main(String[] args) {
        String str="h e l l o r i t e s h";
        StringBuffer modified=new StringBuffer();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                modified.append(str.charAt(i));
            }
        }
        System.out.println("modified string "+modified);
    }
}

package com.sumitsircodes.MySolutions;

public class RemoveSpaceAndCount {
    public static void main(String[] args) {
        String str="h e l l o v i r a t k o h l i";
        char ch='l';
        int count=0;
        String newstr=str.replaceAll(" ","");
//        System.out.println(newstr);
        for(int i=0;i<newstr.length();i++){
            if(newstr.charAt(i)==ch){
                count++;
            }

        }
        System.out.println("newstr "+newstr+" count of required char is "+count);

    }
}

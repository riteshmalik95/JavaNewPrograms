package com.JavaPracticePrograms.StringCodes;

public class AlternateCase {
    public static void main(String[] args) {
        String s="automation";
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(i%2==0){
                sb.append(Character.toUpperCase(ch));
            }else{
                sb.append(Character.toLowerCase(ch));
            }
        }
        System.out.println(sb);
    }
}

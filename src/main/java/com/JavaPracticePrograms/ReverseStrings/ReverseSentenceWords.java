package com.JavaPracticePrograms.ReverseStrings;
//First Method is Normal Method
//Collections.reverse()   Method
/*new ArrayList<>(Arrays.asList(sentence.split(" ")));
Creates a modifiable (mutable) ArrayList
✔ Supports:
Collections.reverse()
add(), remove()
Sorting
 */

public class ReverseSentenceWords {
    public static void main(String[] args) {
        String str="i love my parents";
        String [] words=str.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            sb.append(words[i]+" ");
        }
        System.out.println(sb.toString().trim());
        //Directly sb does not have trim() method so for this we have to take help of toString() method for
        //using trim() method
        System.out.println(sb);
    }
}

package com.miscellaneous;

public class this_Keyword {
    //Class Variables/Instance Variables
    //'this' always representing the class/object.
    int x,y;

//    this_Keyword(int x,int y){
//         this.x=x;
//         this.y=y;
//    }
    void setdata(int x,int y){
      this.x=x;
      this.y=y;
    }

    void display(){
        System.out.println(x);
        System.out.println(y);
    }

    public static void main(String[] args) {
//        this_Keyword key=new this_Keyword(100,200);
        this_Keyword th=new this_Keyword();

        th.setdata(10,20);
        th.display();
    }
}

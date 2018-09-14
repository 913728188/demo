package com.example.examples;

public class demo1 {

    public static  void change(String str){

        str = "321";
    }

    public static boolean foo(char c){
        System.out.println(c);
        return true;
    }

    public  static void main(String args[]){
        String a = "123";
        change(a);
        System.out.println(a.toString());


    }
}

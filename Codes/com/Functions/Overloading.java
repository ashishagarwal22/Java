package com.Functions;

// 4th File in Function Lesson
/*
Refer the **Notes --> Function Section** for below script.
 */
public class Overloading {
    public static void main(String[] args) {

        message(50);
        message('5');
        message(50,100);

    }

    static void message(int a){
        System.out.println(a);
    }

    static void message(char b){
        System.out.println(b);
    }
    static void message(int a, int b){
        System.out.println(a+b);
    }
}

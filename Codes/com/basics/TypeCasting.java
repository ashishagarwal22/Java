package com.basics;

import java.util.Scanner;

//3rd File in Basic Java.
/*
Refer the **Notes --> Java Programming Section** for below script.
 */
public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //"TypeCasting" --> Explicit Type Casting
        int num = (int)526.265f;
        System.out.println(num);

        //Automatic "Type Promotion" in evaluating expressions
        int a = 260;
        byte b = (byte)a;
        System.out.println(b);
        //byte b = a will give error as maximum value possible for byte is 256
        //Type casting it will give a remainder after the maximum value from 256*n.
        b  = (byte)600;
        System.out.println(b);

        byte x = 40;
        byte y = (byte)300;
        byte z = 50;
        int r = (x*y)/z;
        // Java internally is promoting every evaluation into int, as byte cannot store 40*44
        // And we have to store the result into 'int', otherwise it will give an error.
        System.out.println(r);

        System.out.println("---");
        int number = 'A';
        System.out.println(number);

        // Java follows Unicode principle
        // That means, we can give input from any internationalized language. It is not limited to 256 ASCII characters only.
        System.out.println("नमस्ते");


        //Example for thorough revision of concepts
        byte bb = 42;
        char c = 'a';
        short s = 1024;
        int i = 321;
        float f = 123.231f;
        double d = 1.523;
        double result = (f*bb) + (i/c) - (d-s);
        // result = float + int - double
        // Every internal term is promoted to its destination data type. Same goes for final evaluation of result.
        System.out.println("result = " +  (f * bb) + " + " + (i / c) + " - " + (d-s));
        System.out.println(result);
    }
}

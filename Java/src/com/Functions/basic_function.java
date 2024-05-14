package com.Functions;

import java.util.Scanner;

// 1st File in Function Lesson
/*
Refer the **Notes --> Function Section** for below script.
 */
public class basic_function {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input and output, both will be handled by Function itself.
        sum();


        System.out.println("---");


        /*
        sum_o();
        Input will be handled by function itself.
        Above code will work but not show anything, because it is returning the output and
        so we need to catch it and store it in the reference variable from main function.
         */
        int result = sum_o();
        System.out.println("Sum (with output function only) is: " + result);


        System.out.println("---");


        int a = input.nextInt();
        int b = input.nextInt();
        result = sum_io (a , b);
        System.out.println("Sum (with I/O) is: " + result);


        System.out.println("---");


        a = input.nextInt();
        b = input.nextInt();
        result = sum_iom (a , b);
        System.out.println("Sum (with I/O and message) is: " + result);


    }

    //Function with no Input and output outside the function
    static void sum() {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("Sum (with no I/O) is " + (a+b));
    }

    //Function with no Input but with output (Return type = int)
    static int sum_o(){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        return a+b;
    }

    //Function with Input and Output
    static int sum_io(int a,int b){
        return a+b;
    }

    //Function with Input, Output and some Message display
    static int sum_iom(int a, int b){
        System.out.println("Calculating the Sum...");
        return a+b;
    }
}

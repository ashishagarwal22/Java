package com.basics;

import java.util.Scanner;

//2nd File in Basic Java.
/*
Refer the **Notes --> Java Programming Section** for below script.
 */
public class datatype {
    public static void main(String[] args) {
        System.out.println("Begin");

        //primitive datatype
        int lite;
        int rollno = 64;
        char letter = 'r';
        float marks = 98.67f;
        double largeDecimalNumbers = 45626213.126;
        long largeIntegerValues = 216216654L;
        boolean check = false;

        //String is not a primitives, as we can further break it down.
        String name = "Ashish Agarwal";

        // ctrl + slash('/') is used to comment the selected block of code.

        System.out.println("Please enter your name");
        Scanner input_name = new Scanner(System.in);
        String full_name = input_name.nextLine(); // Note, we have to use Next Line, otherwise, it'll read the first name only
        System.out.println("Name: " + full_name);



        System.out.println("Please enter your roll no");
        Scanner input_roll = new Scanner(System.in);
        int roll_no = input_roll.nextInt();
        System.out.println("Your roll number is: " + roll_no);


        System.out.println("Let's check out the Sum code");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int result = num1 + num2;
        System.out.println("Sum of " + num1 + " + " + num2 + " =   " + result);
    }
}

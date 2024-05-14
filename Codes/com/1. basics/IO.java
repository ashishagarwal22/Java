package com.basics;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

//1st File in Basic Java.
/*
To know about each term in this Script and the structure and outline of Java code, refer to the
**Notes --> Java Programming Section**.
 */
public class IO {
    public static void main(String[] args){
        System.out.println("Hey, Ashish!");
        System.out.println("sout is the shortcut for typing System.out.println in IntelliJ IDE");
        System.out.println("Now we'll look how to take input");

        System.out.println("Pleas Enter your Name :");
        Scanner input_object = new Scanner(System.in);
        System.out.println("Welcome " + input_object.next());
        //next() will only take the next word as an input.

        System.out.println("---");

        System.out.println("Please Enter your Welcome line:");
        Scanner input_line = new Scanner(System.in);
        System.out.println(input_line.nextLine());
        //nextLine() will take the whole next line as an input.

        System.out.println("---");

        System.out.println("Please enter an integer:");
        Scanner input_int = new Scanner(System.in);
        System.out.println(input_int.nextInt());
        //nextInt() will take the next Integer value as an Input. Similarly, we have nextFloat, nextLong() and so on.

        System.out.println("---");

        System.out.println("That's it for the Input and the Output Lesson.");

        // There are so many method for the Input Object. Some of them are next, nextLine, nextInt.
        // Just go through them once.
    }
}

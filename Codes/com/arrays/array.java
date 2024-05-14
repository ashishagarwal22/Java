package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

// 1st File in Array Lesson
/*
Refer the **Notes --> Arrays Section** for below script.
 */
public class array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Arrays are declared like any other objects in the Java.
        // SO they have to be initialized as such.

        // Array instantiation
        // dtype[] ref_variable_name = new dtype[size];
        int[] rollno = new int[5];

        // or directly as
        int[] rollno2 = {21,45,108,621,20};

        int[] ros;        //declares an array. ref variable fro array "ros" is defined in the stack memory.
        ros = new int[5]; // initialisation of an array. Create the array object in the heap memory.

        // arr.length depicts the size of an array.
        System.out.println(ros.length);

//        System.out.println(ros[0]);       //Default value of Integer Array Element is 0
//        String[] value = new String[5];
//        System.out.println(value[0]);     //Default value of String Array Element is Null.


        //If we want to take input for array elements. We can use the for loop
        for (int i = 0; i < ros.length; i++) {
            ros[i] = input.nextInt();
        }

        //We can print the every element of array in the same way.
        for (int i = 0; i < ros.length; i++) {
            System.out.print(ros[i] + ", ");
        }

        //Enhance way to represent array
        // This is known as "for each" loop
        for(int num: ros){                 // for element in array, execute the code block
            System.out.print(num + " ");        //Here, num represents the number of element in array
        }


        // We can use the Array class to ease our work for several tasks.
        // Like to print Array elements
        System.out.println(Arrays.toString(ros));

        //modification. We can access elements directly to modify them.
        ros[4] = 55;
        System.out.println(Arrays.toString(ros));
    }
}

package com.arrays;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

// 4th File in Function Lesson
/*
Refer the **Notes --> Function Section** for below script.
 */
public class ArrayListnd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Multi Dimension ArrayList
        // We passed ArrayList object instead of the wrapper class in outer ArrayList.

        // Declaration part of highest level ArrayList.
        ArrayList<ArrayList<Integer>> ndlist = new ArrayList<>();

        // Initialisation part
        // This is important step, as it is adding the list within the outer Array. Because initially it is Null.
        for (int i = 0; i < 3; i++) {
            ndlist.add(new ArrayList<>());
        }


//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                ndlist.get(i).add(input.nextInt());
//            }
//        }
//
//        System.out.println(ndlist);
//        for (int i = 0; i < 3; i++) {
//            System.out.println(ndlist.get(i));
//        }


        // How to code for input of variable length for mult-dimensional Arraylist.
        // This code will take input for elements of ArrayList within array, until it fetch '-1'
        // If it fetch '-1', it will move on to the next ArrayList within outerArray.
        for (int i = 0; i < 3; i++) {
            while(true){
                int temp = input.nextInt();
                if (temp != -1) {
                    ndlist.get(i).add(temp);
                } else break;
            }
        }

        System.out.println(ndlist);

    }
}

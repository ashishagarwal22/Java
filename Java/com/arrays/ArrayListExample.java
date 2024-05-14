package com.arrays;

import java.util.ArrayList;
import java.util.Scanner;

// 3rd File in Function Lesson
/*
Refer the **Notes --> Function Section** for below script.
 */
public class ArrayListExample{
    public static void main(String[] args) {
        // Array List are used when we don't know the size of Array we are gonna needed.
        // Rest ArrayList is same as array.

        // Syntax for Array list
        // ArrayList<Dtype_wrapper_class> ref_var = new ArrayList<>;
        // We need to use Wrapper class of the needed data type. like Integer for the int.

        ArrayList<Integer> list = new ArrayList<>(10);
        // Initial capacity/size does not matter. We can add as much as we want.

        //ArrayList has a method called "add" to add the elements in the ArrayList.
        list.add(21);
        list.add(6);
        list.add(51);
        System.out.println(list);


        // ArrayList has a method called "set" to set the value of the particular index.
        list.set(0,0621);
        System.out.println(list);


        //ArrayList has a method called "remove" to remove the value at any particular index.
        list.remove(1);
        System.out.println(list);


        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            list.add(input.nextInt());
        }
        System.out.println(list);


        //Arraylist has a method called "get" to get the value at any index.
        //ArrayList[index] will not work here.
        for (int i = 0; i < 7; i++) {
            System.out.println(list.get(i));
        }

    }
}

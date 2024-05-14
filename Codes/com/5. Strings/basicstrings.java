package com.Strings;

import java.util.ArrayList;

// 1st File in Strings Lesson
/*
Refer the **Notes --> String Section** for below script.
 */
public class basicstrings {
    public static void main(String[] args) {

        // String are Immutable. Pass by Value (and not by reference)
        /*
        String name = "Ashish Agarwal";
        System.out.println(name);  // Will return 'Ashish Agarwal'.

        // Strings are immutable.
        //   SO when we reassign anything to string object,
        //   it will create new object value and then point to the newly created object.
        //   Earlier created object value "Ashish Agarwal" is still there in the heap memory, but now not pointed by any ref var.
        name = "Ashish";
        System.out.println(name);  // Will return 'Ashish'.

        // If new ref var object created and stored the value of the object that is already created,
        //  then both will point to same object value.
        String naam = "Ashish";
        // Both 'name' and 'naam' pointing to same object value "Ashish" in the heap memory.
         */




        // How to compare object value and at same time compare their memory allocation.
        /*
//        Comparison operator "==" checks for both the 'content' and their 'memory allocation'.
//        If both the comparison operand are pointing to same opject value, then only "==" will return true.
        String name1 = "Ashish";
        String name2 = "Ashish";
        System.out.println(name1 == name2);  // Return 'True', because both the content and address are same.

        String a = new String("Ashish");
        String b = new String("Ashish");
        System.out.println(a == b);          // Return 'False', because content are same but not the memory address.

//        ".equals" operator only check for the "content" and "not the memory allocation".
//        Suppose if we create new operand with '.copy', it creates new object value with same content.
//        In those cases "==" return false BUT ".equals" return true.
        System.out.println(a.equals(b));
        // Return 'True', because content are same. And .equals does not care for address
         */

        // String concatenation
        System.out.println('a' + 'b');   // With single quote it's gonna assume char and return it's ASCII value.
        System.out.println("a" + "b");   // WIth Double quote it's gonna assume String and concatenate it.
        System.out.println((char)('a' + 3));   // With single quote it's gonna assume char and return it's ASCII value.
        System.out.println(new ArrayList<>());  //Any Object printing will call the ".toString()" method and print it.
        System.out.println("Ashish" + new ArrayList<>());
        System.out.println("Ashish" + new Integer(56));

        // Important for Concatenation --> Operator "+" only allows for concatenation, if one of operand is String or primitive dt.
        // System.out.println(new ArrayList<>() + new Integer(56)); // Thus this will give error. This is 'Expression'.
        System.out.println(new ArrayList<>() + " " + new Integer(56));
    }

}

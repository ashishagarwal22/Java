package com.Strings;

import java.util.Arrays;

// 3rd File in Strings Lesson
/*
Refer the **Notes --> String Section** for below script.
 */
public class StringMethod {
    public static void main(String[] args) {
        String name = "Ashish Agarwal";
        System.out.println(Arrays.toString(name.toCharArray()));

        // toLowerCase method
        System.out.println(name.toLowerCase());  // Creates new object for the return string.
        System.out.println(name);    // Original will not change

        // Strip Method
        System.out.println("     Ashish       ".strip());
        System.out.println(Arrays.toString("As hi sh Ag ar wal".split(" ")));

        // replaceALL method
        // Note this is the method for string object and not for StringBuffer object.
        System.out.println(name.replaceAll("\\s",""));

        String arr = "Ashish Agarwal is Amazingly Awesome";
        String[] arrr = arr.split(" ");
        System.out.println(Arrays.toString(arrr));

        // There are many-many more methods in String class. You are to refer them on your own from the Documentation.
    }
}

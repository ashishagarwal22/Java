package com.Functions;

// 2nd File in Function Lesson
/*
Refer the **Notes --> Function Section** for below script.
 */
public class shadowing {

    static int x = 50; // Shadowing
    public static void main(String[] args) {

        System.out.println(x); // Will print 50
        int x=10;
        // This will shadow and hide the variable 'x' from the higher level scope.

        System.out.println(x); // Will print 10 (Shadowed)
        temp();                // Will print 50. As the variable 'x' accessed by the function temp is from the higher level scope.
    }
    static void temp(){
        System.out.println(x);
    }
}

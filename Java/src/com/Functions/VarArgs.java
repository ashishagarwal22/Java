package com.Functions;

import java.util.Arrays;

// 3rd File in Function Lesson
/*
Refer the **Notes --> Function Section** for below script.
 */
public class VarArgs {
    public static void main(String[] args) {

        UnknownArgs(51,35,42,0,56);

        multiVarArgs(50,100, 80,60,100,0,150);

    }

    static void UnknownArgs(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void multiVarArgs(int a, int b, int ...num){      //vararg parameter must be at the end of the list
        System.out.println(Arrays.binarySearch(num, a)); //Search for number a in array
        System.out.println(Arrays.binarySearch(num, b));
    }

}

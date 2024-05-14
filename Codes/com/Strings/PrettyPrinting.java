package com.Strings;

// 2nd File in Strings Lesson
/*
Refer the **Notes --> String Section** for below script.
 */
public class PrettyPrinting {
    public static void main(String[] args) {

        // "%" is called placeholder
        // After placeholder, we have to specify what dtype this placeholder is used for.
        // After completing the print message, write all the variables in the respective manner after the comma ",".
        // We have to use "printf", meaning Formatted String.
        float a = 45.41654f;
        System.out.printf("Formatted number is %.2f", a);   //It will automatically ROUND it to 2 decimal places.

        System.out.println("\n" + Math.PI);

        System.out.printf("Value of PI is %.4f", Math.PI);

        System.out.printf("\n" + "Hello my name is %s and I am %s", "Ashish", "Cool");



    }
}

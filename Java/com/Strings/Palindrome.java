package com.Strings;

import java.io.StringBufferInputStream;
import java.util.Scanner;


// 5th File in Strings Lesson (Question --> Palindrome Program)
/*
Refer the **Notes --> String Section** for below script.
 */
public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Check whether the String is palindrome or not
        // Palindrome means that word should be same in reverse format also.

        while(true){
            System.out.println("Do you wish to continue (Y/N): ");
            if(in.next().charAt(0) == 'N'){
                break;
            }


            String word = in.next();
            System.out.println(word + " is palindrome: " + isPalindrome(word));
        }

    }


    static boolean isPalindrome(String str) {
        if(str == null || str.length() == 0){
            return true;
        }


        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

}

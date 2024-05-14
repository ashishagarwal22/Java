package com.logic;

import java.util.Scanner;

public class question4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Question 4 - Counting occurrence of digit in large number
        // Like 7 in n = 13785379875757

        // For such question, in which we have to check the individual digit.
        // Do the modulo and dividend operation in loop until it goes to 0 and do the whatever logic operations you have to do.
        // We can also convert the number into string and check each char by charAt() method.

        System.out.println("Enter the number");
        Long n = input.nextLong();

        int count = 0;
        int temp;
        int check = 7;

        while(n!=0){
            temp = (int) (n%10);
            if(temp == check){
                count++;
            }
            n = n/10;
        }
        System.out.println("Count of 7 in the number is: " + count);


    }
}

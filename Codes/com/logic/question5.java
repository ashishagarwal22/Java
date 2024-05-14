package com.logic;

import java.util.Scanner;

public class question5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Question 5 - Reverse the number.

        System.out.println("Enter the number you wish to reverse");
        int num = input.nextInt();
        int result=0;

        while(num!=0){
            result = (num%10) + (result*10);
            num = num/10;
        }
        System.out.println("Reverse of the number is " + result);
    }
}

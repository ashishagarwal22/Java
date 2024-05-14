package com.logic;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b;
        char operator;

        /*
        do{
            System.out.println("PLease enter the calculation you want to perform");
            a = input.nextInt();
            operator = input.next().charAt(0);
            b = input.nextInt();

            int result = 0;

            if (operator == '*') {
                result = a * b;
            } else if (operator == '/') {
                result = a / b;
            } else if (operator == '+') {
                result = a + b;
            } else if (operator == '-') {
                result = a - b;
            }
            System.out.println(result);
        }while(true && a != 0);
        */

        while (true) {
            System.out.println("PLease enter the calculation you want to perform");
            a = input.nextInt();

            // To break the infinite Loop.
            if(a == 0){
                break;
            }

            operator = input.next().charAt(0);

            // If invalid operation
            if(operator != '+' && operator != '-' && operator != '*' && operator != '/'){
                System.out.println("Invalid Operation");
                break;
            }

            b = input.nextInt();

            int result = 0;

            if (operator == '*') {
                result = a * b;
            } else if (operator == '/') {
                result = a / b;
            } else if (operator == '+') {
                result = a + b;
            } else if (operator == '-') {
                result = a - b;
            }
            // We can use switch for this problem. And it will be more convenient as we have to just match the expression.
            System.out.println(result);
        }

    }
}



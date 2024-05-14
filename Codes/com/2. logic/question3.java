package com.logic;

import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Fibonacci Sequence
        System.out.println("How many number you want to display in Fibonacci Sequence: ");
        int n = input.nextInt();

        int first = 0, second = 1, result;

        System.out.println("1 is 0");
        System.out.println("2 is 1");
        for (int i = 3; i <= n; i++) {
            result = first + second;
            System.out.println(i + " is " + result);
            first = second;
            second = result;
        }

    }
}

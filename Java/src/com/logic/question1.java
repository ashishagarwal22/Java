package com.logic;

import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        // In my opinion, it's best practice tow initialize Scanner Class in first Line.
        // Because we are gonna need it many a times.
        Scanner input = new Scanner(System.in);

        int a,b,c, max;

        // Take the 3 input and find the largest.
        // This will run until we set a to 0.
        while(true){
            System.out.println("Please enter three Number separated by space (Maximum Finder): ");
            a = input.nextInt();
            b = input.nextInt();
            c = input.nextInt();
            if(a == 0) break;

            //Let's assume that 1st Value in the data structure is maximum and traverse the list.
            max = a;

            if (b > max) {
                max = b;
            }

            if (c > max) {
                max = c;
            }

            System.out.println(max);
        }

        // Or we can directly use the package called Math. Math takes 2 variable as an input at a time.
        // int max = Math.max(Math.max(a,b),c);
        // System.out.println(max);
    }
}

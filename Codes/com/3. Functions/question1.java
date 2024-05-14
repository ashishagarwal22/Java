package com.Functions;

public class question1 {
    public static void main(String[] args) {
        // Question 1: Whether a number is prime or not.

        for(int i: new int[]{5,53,9,19,67,29,20,2,21,49}){
            System.out.println(prime(i));
        }

    }

    static boolean prime(int n){
        for (int i = n/2 ; i > 1; i--) {
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}

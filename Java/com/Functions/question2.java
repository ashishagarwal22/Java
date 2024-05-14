package com.Functions;

public class question2 {
    public static void main(String[] args) {
        //Question 2: Find all the divisible for the num;
        divisible(20);
        divisible(53);
        divisible(41);
        divisible(67);
        divisible(39);
        divisible(12465);
    }

    static void divisible(int n){
        for(int i = n; i>=1; i--){
            if(n%i == 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.println(" ");
    }

}

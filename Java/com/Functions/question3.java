package com.Functions;

public class question3 {
    public static void main(String[] args) {
        // Question 3 : Check whether the number is Armstrong number

        for(int i: new int[]{153}){
            System.out.println(isArmstrong(i));
        }

        // Extra Question : Print all the 3 digit armstrong number
        for (int i = 100; i < 1000; i++) {
            if(isArmstrong(i)){
                System.out.println(i);
            }
        }
    }

    static boolean isArmstrong(int num){
        int sum = 0;
        int n = num;

        while(n!=0){
            int rem = n%10;
            sum = sum + (rem*rem*rem);
            n = n/10;
        }

//        if(sum == num){
//            return true;
//        }
//        return false;

        return sum == num;  // We can directly return for the above if-else statement.
    }
}

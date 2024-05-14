package com.logic;

import java.util.Scanner;

//1st File in com.Logic.
/*
Refer the **Notes --> Conditional and Loop Section** for below script.
 */
public class basic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //'If' with always True
        if (true) {
            System.out.println("Hello User");
        }
        if (false) {
            System.out.println("Are you able to enter, user!");
        }

        //If-Else
        int a = 10;
        if (a == 10) {
            System.out.println("Hi! You've successfully enter the True logic");
        } else {
            System.out.println("you are required to substitute a with value 10.");
        }

        //If-Else-if-Else
        System.out.println("Please enter some positive number (if - (else if) - else lesson):");
        int num = input.nextInt();
        if(num>0 && num < 10){
            System.out.println("Number is Single Digit");
        }else if(num >= 10 && num <100){
            System.out.println("Number is Double Digit");
        }else if(num >=100 && num <1000){
            System.out.println("Number is Triple Digit");
        }else{
            System.out.println("Number is of more than 3 digits.");
        }




        //While
        int count = 1;
        while(count<=5){
            System.out.println("Hey, you've not completed the 5 Level. Level - " + count);
            count++;
        }

        //for loop
        for(count=5; count >=1; count--){
            System.out.println("Level = " + count);
        }

        //When you don't know, for how many times the loop will run, use the While loop.
        //When you know for how many times, you've tu run the loop, use the For loop

        //do-while loop
        // For this type of loop, code block is going to execute "first" and "at least once", before checking the condition.
        do{
            System.out.println(count);
            count++;
        }while(count<=5);





        // SWITCH Lesson
        System.out.println("Please enter the fruit name ('Banana','Mango','Apple') (Switch Lesson)");
        String fruit = input.next();

        /*
        // ".equals" method check the object to the specified sequence of characters or String.
        if(fruit.equals("mango")){
            System.out.println("It is Yellow orangish in color");
        }
        if(fruit.equals("apple")){
            System.out.println("It is Red in color");
        }
        if(fruit.equals("banana")){
            System.out.println("It is Yellow in color");
        }
        */

        // Better way to write the above commented code is via Switch Method.
        // Cases must be a constant or literal. Case cannot be duplicates.
        // Must used Break in each case, otherwise it will move on to and run the next cases (without matching with the condition of case).
        // Default is used at the end, when none of the case matches the expression.

        switch(fruit){
            case "Mango":
                System.out.println("It is Yellow orangish in color");
                break;
            case "Apple" :
                System.out.println("It is Red in color");
                break;
            case "Banana" :
                System.out.println("It is Yellow in color");
                break;
            default :
                System.out.println("Entered text is not the Fruit");
        }

        // Enhance Switch Method
        // Use case of when not to use Break
        System.out.println("Please enter number between 1 to 7 (Enhance Switch Lesson):");
        int day = input.nextInt();
        switch(day){
            case 1,2,3,4,5 -> System.out.println("Weekday");
            case 6,7 -> System.out.println("Weekends");
        }

        /*
        Last but not the Least,
        we can use the NESTED for any of the above logic and flow statements
        Nested If-else
        Nested For
        Nested While
        Nested Switch
         */
    }
}

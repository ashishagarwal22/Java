package com.logic;

import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Question 2 --> Whether the input character is uppercase or lowercase
        char ch;
        int character;

        // Use Ascii for this
        // A=65, Z=90, a=97, z=122

        while(true){
            // There's no way to take the char Input. So we will Input string and take the char at first place.
            System.out.println("Please enter a character (Lowercase or Uppercase finder) (Press 'A' to exit): ");
            ch = input.next().charAt(0);
            character = (int)ch;
            if(character == 65) break;

            if(character>=65 && character <=90){
                System.out.println("Input Character is Uppercase");
            }else{
                System.out.println("Input character is Lowercase");
            }
        }

        /*
        // Or We can directly compare char with character, without using the ASCII.
        if(ch>'a' && ch<'z'){
            System.out.println("Character is Uppercase");
        }else{
            System.out.println("Character is Lowercase");
        }
        */
    }
}

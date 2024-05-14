package com.Strings;

import java.util.Random;

// 7th File in Strings Lesson. Question --> Random String Generator.
/*
Refer the **Notes --> String Section** for below script.
 */
public class RandomString {
    public static void main(String[] args) {

        Random random = new Random();

        // WIll return any decimal number between 0 to 1.
        System.out.println(random.nextFloat());

        // Will return any decimal number between 0 to 26, Convert to (int)
        System.out.println((int)(26*random.nextFloat()));

        StringBuffer str = new StringBuffer();
        // Use above as random integer for 26 ascii characters of 'a' to 'z'
        for (int i = 0; i < 10; i++) {
            int temp = (int)(26*random.nextFloat());
            char ch = (char)(97 + temp);
            str.append(ch);  // String can append character dt.
        }
        System.out.println(str);

    }
}

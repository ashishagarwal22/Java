package com.Strings;


// 6th File in Strings Lesson
/*
Refer the **Notes --> String Section** for below script.
 */
public class LargeStrings {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("Ashish Agarwal");

        String str = sb.toString();
        System.out.println(str);

        // Diffferent way of initialising constructor object.
        StringBuffer sb2 = new StringBuffer("Ashish Agarwal");
        StringBuffer sb3 = new StringBuffer(30);  // Default = 16

        // Append Method
        sb2.append(" is awesome");
        System.out.println(sb2);

        // Insert method
        sb2.insert(sb2.length()-7,"amazingly ");
        System.out.println(sb2);

        // Replace method
        sb2.replace(0,14, "Baba Ashish");  //End is exclusive. So +1.
        System.out.println(sb2);

        // Delete Method
        sb2.delete(0,5);
        System.out.println(sb2);


    }
}

package com.File;

import java.io.OutputStreamWriter;
import java.io.IOException;

// 4th File in File handling
/*
Refer the **Notes --> File Handling Section** for below script.
 */
public class OutputStreamWriterEx {
    public static void main(String[] args) {

        // "System.out" is "OutputStream"
        try(OutputStreamWriter osw = new OutputStreamWriter(System.out)){
            String str = "Printing using an OutputStream Class";

            osw.write(str);
            System.out.println();
            osw.write(97);
            osw.write(10);  //10 is ASCII for \n
            System.out.println();
            osw.write('A');
            System.out.println();
            osw.write("\n");


            char[] arr = "Ashish Agarwal".toCharArray();
            osw.write(arr);

        }catch(IOException e){
            System.out.println(e.getMessage());
        }

        // Very Important --> Debug this and then run the code, Understand how is it working. or Flow

    }
}

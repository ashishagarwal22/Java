package com.File;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

// 6th File in File handling
/*
Refer the **Notes --> File Handling Section** for below script.
 */
public class BufferedWriterEx {
    public static void main(String[] args) {

        try(BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){

            String str = "Printing using an BufferedWriter Class";
            bw.write(str);


        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}

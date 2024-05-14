package com.File;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

// 3rd File in File handling
/*
Refer the **Notes --> File Handling Section** for below script.
 */
public class BufferReaderEx {
    public static void main(String[] args) {

        /*
        BufferReade reads text from a character-input stream or buffering character so as to provide for the
        efficient reading of characters, arrays and lines.

        BufferedReader object takes in the param of "Reader" class.
        Meaning , of "character stream".
        And "System.in" is of "Byte Stream".
        Thus, if we want to input from keyboard, we have to convert "ByteStream" to "Character Stream".
        And, that can be done by InputStreamReader
         */

        //If doubt with param of BufferedReader, check its constructor. Or read above comment block.
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){

            String str = br.readLine();
            System.out.println(str);

        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}

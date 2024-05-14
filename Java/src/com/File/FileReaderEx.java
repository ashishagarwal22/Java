package com.File;

import java.io.FileReader;
import java.io.IOException;

// 2nd File in File handling
/*
Refer the **Notes --> File Handling Section** for below script.
 */
public class FileReaderEx {
    public static void main(String[] args) {

        //param is InputStream.
        //for FileReader, InputStream = source file name
        //CWD is the project folder. So have to specify the location from  the folder source.
        try(FileReader fr = new FileReader("./src/com/File/input.txt")){

            //read() nethod returns an int. That's why we have to use int only.
            // char are promoted to Int (using their ascii or unicode value).
            int letter = fr.read();
            while(fr.ready()){
                System.out.print((char)letter);
                letter = fr.read();
            }

            System.out.println("\n\n File Reading Successful");

        }catch(IOException e){
            System.out.println(e.getMessage());
        }

    }


}

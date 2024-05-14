package com.File;

import java.io.FileWriter;
import java.io.IOException;

// 5th File in File handling
/*
Refer the **Notes --> File Handling Section** for below script.
 */
public class FileWriterEx {
    public static void main(String[] args) {

        try(FileWriter fw = new FileWriter("./src/com/File/output.txt")){

            // FileWriter will create the New File and write it, if not exists.
            // FilwWriter will override the existing file and write it, if already exists.
            // If you don't want to "Overwrite" and instead "append" on existing file, then use:
            // FileWriter fw = new FileWriter("./src/com/File/output.txt", append: true)


            String str = "Congratulations! You have successfully output the text in the File.";

            fw.write(str);
            fw.write("\n");
            System.out.println();
            fw.write(97);
            fw.write(10);  //10 is ASCII for \n
            System.out.println();
            fw.write('A');
            System.out.println();
            fw.write("\n");

            char[] arr = "Ashish Agarwal".toCharArray();
            fw.write(arr);

        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}

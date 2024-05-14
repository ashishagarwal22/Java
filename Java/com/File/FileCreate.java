package com.File;

import java.io.File;
import java.io.IOException;

// 7th File in File handling
/*
Refer the **Notes --> File Handling Section** for below script.
 */

// File Class
// Refer to the Documentation for complete File Class Detail.
public class FileCreate {
    public static void main(String[] args) {

        try{
            File fo = new File("./src/com/File/newFileCreation.txt");
            fo.createNewFile();

        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}

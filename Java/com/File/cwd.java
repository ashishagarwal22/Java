package com.File;

import java.io.IOException;

// Extra File in File handling
/*
Refer the **Notes --> File Handling Section** for below script.
 */
public class cwd {
    public static void main(String[] args) throws IOException {

        // param value = "." represents --> cuurent folder.
        // Meaning, get the path of the current folder.
        //getCanonicalPath() method (of the File class) returns the path of the specified folder.
        String currentPath = new java.io.File(".").getCanonicalPath();
        System.out.println("Current dir:" + currentPath);
    }
}

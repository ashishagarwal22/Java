package com.File;
import java.io.IOException;
import java.io.InputStreamReader;

// 1st File in File handling
/*
Refer the **Notes --> File Handling Section** for below script.
 */
public class InputStreamReaderEx {
    public static void main(String[] args) {

        // "System.in" is "InputStream"
        // InputStreamReader takes the input in ByteStream and gives output in Character Stream.
        try (InputStreamReader isr = new InputStreamReader(System.in)){

            System.out.println("Enter Some number");
            //InputStreamReader.read() will read one character at a time.
            int letters = isr.read();  //read() method returns an integer
            // Even though, it will read one character at a time, we can still provide all the characters in one go and use it.
            // For detailed explanation, read below comment blocks.
            /*
            ref_var.read() will read one character at a time.
            Even if you've written the "Sequence of character" in the console/keyboard,
            it will not read the complete stream in one go.
            Personnel observation --> But the advantage over the Scanner is, that we don't have to take the input
            in the sequential manner (sequential as per the code). Because scanner takes the input with the "next" method.
            So, while running sequentially, it "asks and wait" for the input, when the input method is called.

            What do we mean by above observation. Let's see
             */
            //ISR.read() methods check whether Stream Object is ready to read or not.
            // Basically, whether it is ready or not.
            while(isr.ready()){
                System.out.println((char) letters);
                letters = isr.read();
            }
            /*
            See -> In the above while loop, when we've print the first character (from our input stream),
            it again read the next character from ALREADY ENTERED input stream from the first call.
            Now, notice the difference here. We've already entered the Input stream from the first call.
            If it was the scanner. We've to type the input again and at this point of time.

            **This way we can type in all the Inputs in one go and read the input stream whenever required.
             */

            // We have to close the InputStreamReader. Because it is using the "Resource".
            // Though after ver 7, try and catch will automatically close it.
            isr.close();
        } catch(IOException e){
            System.out.println(e.getMessage());  // It's a code to print IOException message.
        }

    }
}

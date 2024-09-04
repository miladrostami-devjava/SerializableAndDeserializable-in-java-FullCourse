package com.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class BinaryLogger_PrintStreamDemo {

    public static void main(String[] args) {
        try (PrintStream out = new PrintStream(new FileOutputStream("C:\\Users\\Parse\\Desktop\\MiladTask\\JavaCoreTask\\SerializableAndDeserializable-in-java\\PrintStreamandPrintWriter-in-java\\src\\main\\resources\\binaryLog.txt"))) {



            byte[] data = {65, 66, 67, 68, 69}; // A, B, C, D, E
            for (byte b : data) {
                out.write(b);
            }

            // Insert text as an example

            out.println("\nLog Entry Complete");
            System.out.println("operation done!!!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}

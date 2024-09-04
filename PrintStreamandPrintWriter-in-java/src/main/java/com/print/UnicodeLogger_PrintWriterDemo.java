package com.print;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class UnicodeLogger_PrintWriterDemo {

    public static void main(String[] args) {
        try (PrintWriter out = new PrintWriter(new FileWriter("C:\\Users\\Parse\\Desktop\\MiladTask\\JavaCoreTask\\SerializableAndDeserializable-in-java\\PrintStreamandPrintWriter-in-java\\src\\main\\resources\\unicodeLog.txt"), true)) {

// Writing text in different languages

            out.println("Hello, World!");
            out.println("سلام دنیا!");
            out.println("你好，世界！");
            out.println("Bonjour le monde!");

            if (out.checkError()) {
                System.out.println("An error occurred while writing to the file.");
            }
            System.out.println("operation done!!!");



        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

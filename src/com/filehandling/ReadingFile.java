package com.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadingFile {
    static void main(String[] args) {
        //Byte Streams
        File file = new File("D:\\files/Bye.txt");
        FileInputStream fis = null;
        try{
             fis = new FileInputStream(file);
            int temp;
            while ((temp = fis.read()) != -1) {
                System.out.print((char)temp); //type-casting is done here.
            }
        }
         catch (IOException e) {
             System.out.println(e.getMessage());
        }
        finally {
            try{
                fis.close();
            }
            catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

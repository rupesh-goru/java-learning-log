package com.filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStream {
    static void main(String[] args) {
        /*FileWriter*/
        /*File file = new File("D:/files/Hi2.txt");
        FileWriter fw = null;
        try{
           fw  = new FileWriter(file);
            fw.write("Hello World- this is coming from 'Character Stream'- FileWriter");
            System.out.println("Successfully wrote to the file");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            try {
                fw.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }*/
/*FileReader*/
        File fileReader = new File("D:/files/FIFA-2026 Argentina.txt");
        FileReader fr = null;
        try{
            fr = new FileReader(fileReader);
            int temp;
            while ((temp = fr.read()) != -1) {
                System.out.print((char)temp); // type-cast is must here
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
        finally {
            try {
                fr.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

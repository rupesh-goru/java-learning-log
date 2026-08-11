package com.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyingFile {
    static void main(String[] args) {
        //File file = new File("D:\\files/Hi.txt"); //copying a file from here
        //File file2 = new File("D:\\files/Copy.txt"); //to here
        File file  = new File("D:/files/Pspk/powerstar.jpg"); //coping an image from here
        File file2  = new File("D:\\files/pspkkushi.png");// to here

        FileInputStream fis = null;
        FileOutputStream fos = null;
        try{
            fis = new FileInputStream(file);
            fos = new FileOutputStream(file2);
            int temp;
            while((temp = fis.read()) != -1){
                fos.write(temp);
            }
            System.out.println("File has been copied");
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
        finally{
            try {
                fis.close();
                fos.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

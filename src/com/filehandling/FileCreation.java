package com.filehandling;

import java.io.File;
import java.io.IOException;

public class FileCreation {
    static void main(String[] args) {

        File file = new File("D:\\files/Bye.txt");
         try{
             file.createNewFile();
             System.out.println("File created");
         }
         catch(IOException e){
             System.out.println(e.getMessage());
         }
    }
}

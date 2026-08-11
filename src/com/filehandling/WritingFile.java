package com.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritingFile {
    static void main(String[] args) {
        File file = new File("D:\\files/Hi.txt");
        FileOutputStream fos = null;
try {
    fos = new FileOutputStream(file);
    //byte[] bytes = data.getBytes();
    String data = "Visakhaptnam is city of destiny.";
    fos.write(data.getBytes());
    System.out.println("Successfully wrote to the file.");
}
catch (IOException e){
    System.out.println(e.getMessage());
}
finally {
    try{
        fos.close();
    }
    catch (IOException e){
        System.out.println(e.getMessage());
    }
}

    }
}

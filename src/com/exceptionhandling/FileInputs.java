package com.exceptionhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputs {

    static void main(String[] args) {
        //the only way to handle an exception is only try-catch block.
try {
    FileInputs.readFile();
}
catch (FileNotFoundException e) {
    System.out.println(e.getMessage());
    System.out.println("File not found");
}
    }
    static void readFile() throws FileNotFoundException {
        File file = new File("D:\\FileInpus\\Hiiiii.txt");
        FileInputStream fis = new FileInputStream(file);
    }
}

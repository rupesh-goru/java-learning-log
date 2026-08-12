package com.filehandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Assignment {
    public static void main(String[] args) {

        String folderPath = "D:/File Handling Assignment 11-08-2026/";

        for (int i = 1; i <= 10; i++) {

            File file = new File(folderPath + "File" + i + ".txt");
            FileOutputStream fw = null;

            try {
                fw = new FileOutputStream(file);

                String data = "This is in File " + i;
                fw.write(data.getBytes());

                System.out.println("File written (File " + i + ")");

            } catch (IOException e) {
                System.out.println(e.getMessage());

            } finally {
                try {
                    fw.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }

        System.out.println("Successfully created all the files. Therefore count = 10");
    }
}
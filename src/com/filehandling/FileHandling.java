package com.filehandling;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

public class FileHandling {
    static void main(String[] args) throws IOException {
        File file = new File("D:\\java-learning-journey\\FileHandling\\Resume.txt");
        /*System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());*/
        //System.out.println(file.getParent());
        File file2 = new File(file.getParent() + "\\resume2.docx");
        //file2.createNewFile();
        /*System.out.println(file2.createNewFile());
        System.out.println(file2.exists());*/
        System.out.println(file2.lastModified());
        System.out.println(new Date(file2.lastModified()));
        System.out.println(file.isDirectory());
        System.out.println(file2.isFile());
        //System.out.println(file.list());
       /* for(String fileName : file.list()) {
            System.out.println(fileName);
        }*/
       /* System.out.println(Arrays.toString(file.list()));
        System.out.println(Arrays.toString(file.listFiles()));*/
        //System.out.println(file.mkdirs()); // for multiple folders
        //System.out.println(file.isHidden());
        /*System.out.println(file.canWrite());
        file.setWritable(true);
        System.out.println(file.canWrite());*/
        /*if(file.exists()){
            file.delete();
        }
        System.out.println(file.exists());*/
        // System.out.println(file.createNewFile());
        // System.out.println("File created successfully");
        //System.out.println(file.exists());
        //System.out.println(file.delete());
        //System.out.println(file.createNewFile());
    }
}

package com.filehandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Assignment {
    public static void main(String[] args) {
        File file1 = new File("D:/File Handling Assignment 11-08-2026/File1.txt");

        FileOutputStream fw1 = null;
        try{
            fw1 = new FileOutputStream(file1);
            String data1 = "This is in File 1";
            fw1.write(data1.getBytes());
            System.out.println("File written(File 1)");
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
        finally {
            try {
                fw1.close();
            }
            catch (IOException e){
                System.out.println(e.getMessage());
            }
        }

        File file2 = new File("D:\\File Handling Assignment 11-08-2026/File2.txt");
        FileOutputStream fw2 = null;
        try{
            fw2 = new FileOutputStream(file2);
            String data2 = "This is in File 2";
            fw2.write(data2.getBytes());
            System.out.println("File written(File 2)");
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
        finally {
            try {
                fw2.close();
            }
            catch (IOException e){
                System.out.println(e.getMessage());
            }
        }
        File file3 = new File("D:\\File Handling Assignment 11-08-2026/File3.txt");
        FileOutputStream fw3 = null;
        try{
            fw3 = new FileOutputStream(file3);
            String data3 = "This is in File 3";
            fw3.write(data3.getBytes());
            System.out.println("File written(File 3)");
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
        finally {
            try {
                fw3.close();
            }
            catch (IOException e){
                System.out.println(e.getMessage());
            }
        }
        File file4 = new File("D:\\File Handling Assignment 11-08-2026/File4.txt");
        FileOutputStream fw4 = null;
        try{
            fw4 = new FileOutputStream(file4);
            String data4 = "This is in File 4";
            fw4.write(data4.getBytes());
            System.out.println("File written(File 4)");
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
        finally {
            try {
                fw4.close();
            }
            catch (IOException e){
                System.out.println(e.getMessage());
            }
        }
        File file5 = new File("D:/File Handling Assignment 11-08-2026/File5.txt");
        FileOutputStream fw5 = null;
        try{
            fw5 = new FileOutputStream(file5);
            String data5 = "This is in File 5";
            fw5.write(data5.getBytes());
            System.out.println("File written(File 5)");
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
        finally {
            try {
                fw5.close();
            }
            catch (IOException e){
                System.out.println(e.getMessage());
            }
        }
        File file6 = new File("D:/File Handling Assignment 11-08-2026/File6.txt");
        FileOutputStream fw6 = null;
        try{
            fw6 = new FileOutputStream(file6);
            String data6 = "This is in File 6";
            fw6.write(data6.getBytes());
            System.out.println("File written(File 6)");
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
        finally {
            try {
                fw6.close();
            }
            catch (IOException e){
                System.out.println(e.getMessage());
            }
        }
        File file7 = new File("D:\\File Handling Assignment 11-08-2026/File7.txt");
        FileOutputStream fw7 = null;
        try{
            fw7 = new FileOutputStream(file7);
            String data7 = "This is in File 7";
            fw7.write(data7.getBytes());
            System.out.println("File written(File 7)");
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
        finally {
            try {
                fw7.close();
            }
            catch (IOException e){
                System.out.println(e.getMessage());
            }
        }
        File file8 = new File("D:\\File Handling Assignment 11-08-2026/File8.txt");
        FileOutputStream fw8 = null;
        try{
            fw8 = new FileOutputStream(file8);
            String data8 = "This is in File 8";
            fw8.write(data8.getBytes());
            System.out.println("File written(File 8)");
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
        finally {
            try {
                fw8.close();
            }
            catch (IOException e){
                System.out.println(e.getMessage());
            }
        }
        File file9 = new File("D:\\File Handling Assignment 11-08-2026/File9.txt");
        FileOutputStream fw9 = null;
        try{
            fw9 = new FileOutputStream(file9);
            String data9 = "This is in File 9";
            fw9.write(data9.getBytes());
            System.out.println("File written(File 9)");
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
        finally {
            try {
                fw9.close();
            }
            catch (IOException e){
                System.out.println(e.getMessage());
            }
        }
        File file10 = new File("D:\\File Handling Assignment 11-08-2026/File10.txt");
        FileOutputStream fw10 = null;
        try{
            fw10 = new FileOutputStream(file10);
            String data10 = "This is in File 10";
            fw10.write(data10.getBytes());
            System.out.println("File written(File 10)");
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
        finally {
            try {
                fw10.close();
            }
            catch (IOException e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Successfully created all the files.Therefore count = 10");
    }
}

package com.exceptionhandling.trywithresources;

import java.io.FileInputStream;
import java.util.Scanner;
/*Auto closing of resources is called try-with-resources.*/
public class Practice {
    public static void main(String[] args){

//try-with-resources we declare it like this then there is no need of finally block and close it - sc.close(); not required in finally block.
        /*If you have multiple resources to close then separate them using a semicolon(;) and do it!*/
        try(Scanner sc = new Scanner(System.in) ;
            FileInputStream fis = new FileInputStream("D//FLM/Hi.txt")){
            System.out.println("Enter a number");
            int num = sc.nextInt();
            System.out.println(num / 0);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

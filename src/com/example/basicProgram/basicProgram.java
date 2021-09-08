package com.example.basicProgram;
import java.util.Scanner;

public class basicProgram {
    public static void main(String args[]) {
        // Number is even and odd program
        int num;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        num = in.nextInt();
         if(num %2 ==0)
             System.out.println("Number is even");
         else
             System.out.println("Number is odd");
    }
}
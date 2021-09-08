package com.example.basicProgram;
import java.util.Scanner;

public class basicProgram {
    public static void main(String args[]) {
        // Quotient and remainder program
        int num, num1, result=0;
        int a=1;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        System.out.println("Enter the first number");
        num = in.nextInt();
        System.out.println("Enter the second number");
        num1 = in.nextInt();
        int quotient = num / num1;
        int remainder = num % num1;
        System.out.println("quotient of numbers"+quotient+"remainder of the numbers"+remainder);
    }
}
package com.example.basicProgram;
import java.util.Scanner;

public class basicProgram {
    public static void main(String args[]) {
        // Swap the number
        int num, num1, result=0;
        int a=1;
        int c=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        System.out.println("Enter the first number");
        num = in.nextInt();
        System.out.println("Enter the second number");
        num1 = in.nextInt();
        c = num;
        num =num1;
        num1 = c;
        System.out.println("Swaping with third varable first number"+num+"second number"+num1);
        num = num + num1;
        num1 = num - num1;
        num = num - num1;
        System.out.println("Number swap first number"+num+"second number"+num1);
    }
}
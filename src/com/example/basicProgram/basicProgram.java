package com.example.basicProgram;
import java.util.Scanner;

public class basicProgram {
    public static void main(String args[]) {
        // Program to compute the lead year
        int num, result=0;
        int a=2;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        num = in.nextInt();
        for(int i=0; i<num;i++){
            result = (int) Math.pow(a,i);
            System.out.println(result);
        }

    }
}
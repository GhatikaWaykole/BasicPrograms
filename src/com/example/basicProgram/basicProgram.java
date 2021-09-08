package com.example.basicProgram;
import java.util.Scanner;

public class basicProgram {
    public static void main(String args[]) {
        // Harmoinc Number Program
        int num, result=0;
        int a=1;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        num = in.nextInt();
        for(int i=0; i<=num;i++){
            System.out.println("1/"+i);
        }

    }
}
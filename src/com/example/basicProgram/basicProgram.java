package com.example.basicProgram;
import java.util.Scanner;

public class basicProgram {
    public static void main(String args[]) {
        // Program to compute the lead year
        int year;
        Scanner in = new Scanner(System.in);
        year = in.nextInt();
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))
            System.out.println("Given year is leap year");
        else
            System.out.println("Given year is not the leap year");
    }
}
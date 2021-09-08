package com.example.basicProgram;
import java.util.OptionalInt;
import java.util.Scanner;

public class basicProgram {
    public static void main(String args[]) {
        // Alphabet is vovel or consonant
        int first, second, last;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number");
        first = in.nextInt();
        System.out.println("Enter the second number");
        second = in.nextInt();
        System.out.println("Enter the last number");
        last = in.nextInt();
        if (first > second && first > last)
            System.out.println("Number first greater number");
        else if (second > first && second > last)
            System.out.println("Number second greater number");
        else
            System.out.println("last number greater number");
    }
}
package com.example.basicProgram;
import java.util.Scanner;

public class basicProgram {
    public static void main(String args[]) {
        // Alphabet is vovel or consonant
        char word;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the word");
         word = in.next().charAt(0);
         if(word == 'a' || word== 'e' || word== 'i' || word== 'o' || word== 'u' )
             System.out.println("Word is vovel");
         else
             System.out.println("Word is consonant");
    }
}
package com.example.basicProgram;
import java.util.Scanner;

public class basicProgram {
    public static void main(String args[]) {
        // Flip coin and print percentage of Head and tails
        int tail=0, head=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of times to flip the coin");
        int num  = in.nextInt();
        //System.out.println("number is"+num1);
        for(int i=0;i<num;i++){
            int num1 = (int) Math.floor(Math.random() * 2);
            if(num1 < 0.5)
                tail +=1;
            else
                head +=1;

        }
        int headPercentage = head * 100 / num;
        int tailPercentage = tail * 100 / num;
        System.out.println("Percentage of head"+headPercentage+"percentage of tail"+tailPercentage);
    }
}
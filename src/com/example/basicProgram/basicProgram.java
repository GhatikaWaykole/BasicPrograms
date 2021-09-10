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
        // print the two dimesniaonal array
        int n=0,m=0;
        System.out.println("Enter the number of rows and column");
        m = in.nextInt();
        n = in.nextInt();
        int array[][] = new int[n][m];
        for(int i=0; i<m;i++){
            for(int j=0;j<n;j++) {
                array[i][j] = in.nextInt();
            }
        }
        for(int i=0; i<array.length;i++){
            for(int j=0;j<array.length;j++) {
                System.out.println("Elemets in array"+array[i][j]);
            }
            //sum of three interger add to zero
            int[] array1 = {1,0,-1,2,0,-2};
            int n1= array1.length;
            for(i = 0; i<n1-2; i++){
                int a= array1[i];
                for(int j=i+1;j<n1-1;j++)
                {
                    int b= array1[j];
                    for(int k=j+1;k<n1;k++){
                        int c = array1[k];
                        if(array1[i]+array1[j]+array1[k] == 0)
                            System.out.println("The number having sum zero "+a+" "+b+" "+c);                    }
                }
            }
        }
    }
}
package com.bridgelabz.arrays.levelone;

import java.util.Scanner;

public class OddAndEvenNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        int size = number / 2 + 1;
        int evenArray[] = new int[size];
        int oddArray[] = new int[size];
        int j = 0, i, k = 0;
        input.close();
        if (number > 0) {
            for (i = 0; i < number; i++) {
                if (i % 2 == 0) {
                    evenArray[j++] = i;
                } else {
                    oddArray[k++] = i;
                }
            }
            System.out.println("Even numbers are: ");
            for (i = 0; i < j; i++)
                System.out.print(evenArray[i] + " ");
            System.out.println("\nOdd numbers are: ");
            for (i = 0; i < k; i++)
                System.out.print(oddArray[i] + " ");
        }
    }
}
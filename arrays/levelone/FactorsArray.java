package com.bridgelabz.arrays.levelone;

import java.util.Scanner;

public class FactorsArray {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = input.nextInt();
        int j = 0, maxIndex = 10;
        int factors[] = new int[maxIndex];
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[j++] = i;
                if (j == maxIndex) {
                    maxIndex *= 2;
                    int temp[] = new int[maxIndex];
                    System.arraycopy(factors, 0, temp, 0, factors.length);
                    factors = temp;
                }
            }
        }
        System.out.println("The factors are: ");
        for (int i = 0; i < j; i++)
            System.out.print(factors[i] + " ");
        input.close();
    }
}

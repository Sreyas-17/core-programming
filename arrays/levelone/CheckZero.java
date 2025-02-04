package com.bridgelabz.arrays.levelone;

import java.util.Scanner;

public class CheckZero {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int i = 0;
        int result[] = new int[10];
        int total = 0;
        while (true) {
            int number = input.nextInt();
            if (number <= 0) {
                System.out.print("Enter a positive value: ");
            } else {

                result[i] = number;
                i++;
            }
            if (i == 10)
                break;
        }

        System.out.println("Values in the array are\n: ");
        for (i = 0; i < 10; i++) {
            System.out.print(result[i] + " ");
            total += result[i];
        }
        System.out.println("Total sum of values in the array is: " + total);
        input.close();

    }
}

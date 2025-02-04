package com.bridgelabz.arrays.levelone;

import java.util.Scanner;

public class MultiplicationBetweenNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        if (number >= 6 && number <= 9) {
            for (int i = 1; i <= 10; i++) {
                System.out.printf("%d * %d = %d\n", number, i, (number * i));
            }
        } else
            System.out.println("Entered number is not in between 6 and 9");
        input.close();
    }
}

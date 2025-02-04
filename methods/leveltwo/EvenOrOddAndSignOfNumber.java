package com.bridgelabz.methods.leveltwo;

import java.util.Scanner;

public class EvenOrOddAndSignOfNumber {
    static void isPositive(int numbers[]) {
        for (int i = 0; i < 5; i++) {
            if (numbers[i] > 0) {
                System.out.println(numbers[i] + " is positive");
                isEven(numbers[i]);
            } else if (numbers[i] < 0)
                System.out.println(numbers[i] + " is negative");
            else
                System.out.println(numbers[i] + " is zero");
        }
    }

    static void isEven(int number) {
        if (number % 2 == 0)
            System.out.println(number + " is even");
        else
            System.out.println(number + " is odd");
    }

    static void compareFirstAndLast(int numbers[]) {
        if (numbers[0] > numbers[4])
            System.out.println(numbers[0] + " is greater, between 1st number and 5th number");
        else if (numbers[0] < numbers[4])
            System.out.println(numbers[4] + " is greater, between 1st number and 5th number");
        else
            System.out.println("Both numbers are equal ");
    }

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the 5 numbers: ");
        int numbers[] = new int[5];
        int i;
        for (i = 0; i < 5; i++) {
            numbers[i] = input.nextInt();
        }
        isPositive(numbers);
        compareFirstAndLast(numbers);
        input.close();
    }
}

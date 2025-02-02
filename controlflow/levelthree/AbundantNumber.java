package com.bridgelabz.controlflow.levelthree;

import java.util.Scanner;

public class AbundantNumber {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = input.nextInt();
        System.out.println("The divisors are ");
        int result = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
                result += i;
            }
        }
        System.out.println("\nThe sum of divisors are " + result);
        if (result > number)
            System.out.println("The number is Abundant number");
        else
            System.out.println("The number is not a Abundant number");
        input.close();
    }
}

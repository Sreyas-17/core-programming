package com.bridgelabz.methods.leveltwo;

import java.util.Scanner;

public class SumOfNaturalNumbersUsingRecursion {
    static int sumUsingRecursion(int number, int total, int i) {
        if (i > number) {
            return total;
        }
        return sumUsingRecursion(number, total + i, i + 1);

    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = input.nextInt();
        int result = sumUsingRecursion(number, 0, 1);
        System.out.println("Sum using recursion is " + result);
        int usingFormula = number * (number + 1) / 2;
        System.out.println("Sum using formula is " + usingFormula);
        input.close();
    }
}

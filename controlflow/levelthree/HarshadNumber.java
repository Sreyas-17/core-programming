package com.bridgelabz.controlflow.levelthree;

import java.util.Scanner;

public class HarshadNumber {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        int result = 0;
        int quotient = number;
        while (quotient > 0) {
            int remainder = quotient % 10;
            result += remainder;
            quotient = quotient / 10;
        }
        if (number % result == 0)
            System.out.println(number + " is a Harshad number");
        else
            System.out.println(number + " is not a Harshad number");
        input.close();
    }
}

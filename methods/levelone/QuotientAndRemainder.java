package com.bridgelabz.methods.levelone;

import java.util.*;

public class QuotientAndRemainder {
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[] { quotient, remainder };
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int number = input.nextInt();
        int divisor = input.nextInt();
        int results[]={0,0};
        if (divisor > 0) {
            results = findRemainderAndQuotient(number, divisor);
        }
        System.out.println("Quotient is " + results[0]);
        System.out.println("Remainder is " + results[1]);

        input.close();
    }
}

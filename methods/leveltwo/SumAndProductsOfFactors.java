package com.bridgelabz.methods.leveltwo;

import java.util.Scanner;

public class SumAndProductsOfFactors {
    public static int[] countingFactors(int number) {
        int count=0,j=0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count+=1;
            }
        }
        int factors[] = new int[count];
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[j++] = i;
            }
        }
        return factors;
    }

    public static int sumOfFactors(int factors[]) {
        int total = 0;
        for (int i = 0; i < factors.length; i++) {
            total += factors[i];
        }
        return total;
    }

    public static int productOfFactors(int factors[]) {
        int product = 1;
        for (int i = 0; i < factors.length; i++) {
            product *= factors[i];
        }
        return product;
    }

    public static int sumOfSquaresOfFactors(int factors[]) {
        int results = 0;
        for (int i = 0; i < factors.length; i++) {
            results += Math.pow(factors[i], 2);
        }
        return results;
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = input.nextInt();
        int factors[] = countingFactors(number);
        System.out.print("The factors of the number are: ");
        for (int i : factors)
            System.out.print(i + " ");
        System.out.println("\nThe sum of factors are " + sumOfFactors(factors));
        System.out.println("The products of factors are " + productOfFactors(factors));
        System.out.println("The sum of squares of factors are " + sumOfSquaresOfFactors(factors));
        input.close();
    }
}
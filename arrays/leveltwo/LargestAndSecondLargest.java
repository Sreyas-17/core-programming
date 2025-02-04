package com.bridgelabz.arrays.leveltwo;

import java.util.Scanner;

public class LargestAndSecondLargest {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int i = 0, quotient = number, remainder;
        int vals[] = new int[10];
        int length = Integer.toString(number).length();
        i = length - 1;
        while (i >= 0) {
            remainder = quotient % 10;
            quotient = quotient / 10;
            vals[i] = remainder;
            i--;
        }
        int maximum = -1;
        int secondLargest = -1;
        for (i = 0; i < length; i++) {
            if (vals[i] > maximum) {
                secondLargest = maximum;
                maximum = vals[i];
            }
            
        }
        System.out.printf("%d is largest", maximum);
        System.out.printf("\n%d is second largest", secondLargest);
        input.close();
    }
}

package com.bridgelabz.arrays.leveltwo;

import java.util.Scanner;

public class LargestAndSecondLargestUsingDynamicArray {
    @SuppressWarnings("resource")
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String number = input.next();
        int i = 0, maxDigit = 10;
        int vals[] = new int[maxDigit];

        for (char c : number.toCharArray()) {
            vals[i] = Character.getNumericValue(c);

            if (i == maxDigit - 1) {
                maxDigit *= 10;
                int temp[] = new int[maxDigit];
                System.arraycopy(vals, 0, temp, 0, vals.length);
                vals = temp;
            }
            i++;
        }
        int maximum = -1;
        int secondLargest = -1;
        for (i = 0; i < vals.length; i++) {
            if (vals[i] > maximum) {
                secondLargest = maximum;
                maximum = vals[i];
            } else if (vals[i] > secondLargest && vals[i] != maximum) {
                secondLargest = vals[i];
            }
        }
        System.out.printf("%d is largest", maximum);
        System.out.printf("\n%d is second largest", secondLargest);
        input.close();
    }
}
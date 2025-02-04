package com.bridgelabz.arrays.leveltwo;

import java.util.*;

public class ReverseTheNumber {
    @SuppressWarnings("resource")
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        int quotient = number;
        int result = 0, i = 0;
        int array[] = new int[Integer.toString(number).length()];
        while (quotient > 0) {
            result += 1;
            array[i++] = quotient % 10;
            quotient /= 10;
        }
        for (i = 0; i < result; i++)
            System.out.print(array[i]);
        input.close();
    }
}

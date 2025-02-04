package com.bridgelabz.arrays.levelone;

import java.util.Scanner;

public class FizzBuzzString {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        int i;
        String Array[] = new String[number + 1];
        input.close();
        if (number >= 0) {
            for (i = 0; i <= number; i++) {
                if (i % 3 == 0 && i % 5 == 0)
                    Array[i] = "FizzBuzz";
                else if (i % 5 == 0)
                    Array[i] = "Buzz";
                else if (i % 3 == 0)
                    Array[i] = "Fizz";
                else
                    Array[i] = Integer.toString(i);

            }
            for (i = 0; i <= number; i++)
                System.out.println("Position "+i+"="+Array[i]);
        } else
            System.out.println("Enter a positive value");

    }
}

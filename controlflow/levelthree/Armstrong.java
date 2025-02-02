package com.bridgelabz.controlflow.levelthree;

import java.util.*;

public class Armstrong {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        int result = 0;
        int quotient = number;
        while (quotient > 0) {
            int remainder = quotient % 10;
            result += (int) (Math.pow(remainder, 3));
            quotient = quotient / 10;
        }
        if (number == result)
            System.out.println("The number is armstrong");
        else
            System.out.println("The number is not armstrong");
        input.close();
    }
}
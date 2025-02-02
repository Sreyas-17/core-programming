package com.bridgelabz.controlflow.levelthree;

import java.util.Scanner;

public class CountDigits {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        int result = 0;
        while (number > 0) {
            result += 1;
            number /=  10;
        }
        System.out.println("The number of digits in the number is: "+result);
        input.close();
    }
}

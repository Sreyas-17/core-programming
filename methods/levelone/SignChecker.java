package com.bridgelabz.methods.levelone;

import java.util.Scanner;

public class SignChecker {
    public static int checker(int number) {
        if (number == 0) {
            return 0;
        } else if (number > 0) {
            return 1;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = input.nextInt();
        int check = checker(number);
        if (check == 0) {
            System.out.println(number + " is zero");
        } else if (check > 0) {
            System.out.println(number + " is positive");
        } else {
            System.out.println(number + " is negative");
        }
        input.close();

    }
}

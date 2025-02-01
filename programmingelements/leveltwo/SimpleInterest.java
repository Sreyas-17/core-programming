package com.bridgelabz.programmingelements.leveltwo;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the principal,rate and time: ");
        int principal = input.nextInt();
        int rate = input.nextInt();
        int time = input.nextInt();
        float simpleInterest = (float) principal * rate * time / 100;
        System.out.printf("The Simple Interest is %.3f for Principal %d, Rate of Interest %d and Time %d:",
                simpleInterest, principal, rate, time);
        input.close();
    }
}

package com.bridgelabz.arrays.levelone;

import java.util.Scanner;

public class VotingAge {

    @SuppressWarnings("resource")
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the age: ");
        int age[] = new int[10];
        int i;
        for (i = 0; i < 10; i++) {
            age[i] = input.nextInt();
        }
        for (i = 0; i < 10; i++) {
            if (age[i] >= 18) {
                System.out.println("The student with age " + age[i] + " can vote ");
            } else
                System.out.println("The student with age " + age[i] + " can't vote ");
        }
        input.close();
    }
}
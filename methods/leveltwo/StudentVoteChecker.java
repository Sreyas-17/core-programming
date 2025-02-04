package com.bridgelabz.methods.leveltwo;

import java.util.Scanner;

public class StudentVoteChecker {
    public boolean canStudentVote(int age) {
        if (age >= 18)
            return true;
        else
            return false;
    }

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the age to be checked: ");
        int age[] = new int[10];
        int i;
        for (i = 0; i < 10; i++)
            age[i] = input.nextInt();
        StudentVoteChecker checker = new StudentVoteChecker();
        for (int a : age) {
            boolean result = checker.canStudentVote(a);
            if (result == true)
                System.out.println("The person with age "+a+ " can vote");
            else
                System.out.println("The person with age "+a+" can't vote");
        }
        input.close();

    }
}

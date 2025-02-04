package com.bridgelabz.arrays.leveltwo;

import java.util.Scanner;

public class SalaryBonus {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0;
        double salary[] = new double[10];
        double service[] = new double[10];
        for (i = 0; i < 10; i++) {
            System.out.print("\nEnter the salary and years of service for " + (i + 1) + " employee : ");
            salary[i] = input.nextDouble();
            service[i] = input.nextDouble();
            if (salary[i] < 0 || service[i] < 0) {
                System.out.print("\nEnter the valid salary and years of service for " + (i + 1) + " employee");
                i -= 1;
            }
        }
        double bonus[] = new double[10];
        double new_salary[] = new double[10];
        for (i = 0; i < 10; i++) {
            if (service[i] > 5) {
                bonus[i] = salary[i] * 5 / 100;
                new_salary[i] = bonus[i] + salary[i];
                System.out.println("The stats of " + (i + 1) + " Bonus amount is " + bonus[i] + " new salary is "
                        + new_salary[i] + " and old salary is " + salary[i]);
            } else {
                bonus[i] = salary[i] * 2 / 100;
                new_salary[i] = bonus[i] + salary[i];
                System.out.println("The stats of " + (i + 1) + " Bonus amount is " + bonus[i] + " new salary is "
                        + new_salary[i] + " and old salary is " + salary[i]);
            }
        }
        input.close();
    }
}

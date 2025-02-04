package com.bridgelabz.methods.leveltwo;

import java.util.Scanner;

public class LeapYear {
    static void checkLeapYear(int year) {
        if (year >= 1582) {
            if (year % 4 == 0 || (year % 4 == 0 && year % 100 == 0))
                System.out.println(year + " is a leap year");

            else
                System.out.println(year + " is not a leap year");
        } else
            System.out.println(year + " is not a leap year");
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = input.nextInt();
        checkLeapYear(year);
        input.close();
    }
}

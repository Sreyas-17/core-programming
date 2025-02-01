package com.bridgelabz.programmingelements.leveltwo;

import java.util.*;

public class TemperatureConversion {

    public static void main(String args[]) {
        System.out.print("Enter the celsius temperature:");
        Scanner input = new Scanner(System.in);
        float celsius = input.nextFloat();
        float fahrenheit;
        fahrenheit = (celsius * 9 / 5) + 32;
        System.out.printf("The %.2f celsius is %.2f fahrenheit", celsius, fahrenheit);
        input.close();
    }
}
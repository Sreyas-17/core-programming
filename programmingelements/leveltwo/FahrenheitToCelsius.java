package com.bridgelabz.programmingelements.leveltwo;

import java.util.*;

public class FahrenheitToCelsius{

    public static void main(String args[]) {
        System.out.print("Enter the fahrenheit temperature:");
        Scanner input = new Scanner(System.in);
        float fahrenheit = input.nextFloat();
        float celsius;
        celsius = (fahrenheit-32) * 5/9;
        System.out.printf("The %.2f fahrenheit is %.2f celsius", fahrenheit, celsius);
        input.close();
    }
}

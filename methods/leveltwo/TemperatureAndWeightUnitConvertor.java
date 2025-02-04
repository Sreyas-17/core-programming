package com.bridgelabz.methods.leveltwo;

import java.util.Scanner;

public class TemperatureAndWeightUnitConvertor {
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double poundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    public static double kilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    public static double gallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    public static double litersToGallons(double liters) {
        return liters * 0.264172;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        double celsius = fahrenheitToCelsius(fahrenheit);
        System.out.printf("Celsius: %.3f\n", celsius);
        System.out.printf("Converted back to Fahrenheit: %.3f\n", celsiusToFahrenheit(celsius));

        System.out.print("Enter weight in Pounds: ");
        double pounds = input.nextDouble();
        double kilograms = poundsToKilograms(pounds);
        System.out.printf("Kilograms: %.3f\n", kilograms);
        System.out.printf("Converted back to Pounds: %.3f\n", kilogramsToPounds(kilograms));

        System.out.print("Enter volume in Liters: ");
        double liters = input.nextDouble();
        double gallons = litersToGallons(liters);
        System.out.printf("Gallons: %.3f\n", gallons);
        System.out.printf("Converted back to Liters: %.3f\n", gallonsToLiters(gallons));

        input.close();
    }
}

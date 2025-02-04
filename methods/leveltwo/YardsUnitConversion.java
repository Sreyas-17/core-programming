package com.bridgelabz.methods.leveltwo;

import java.util.Scanner;

public class YardsUnitConversion {

    public static double convertYardsToFeet(double yards) {
        return yards * 3;
    }

    public static double convertFeetToMeters(double feet) {
        return feet * 0.3048;
    }

    public static double convertMetersToInches(double meters) {
        return meters * 39.3701;
    }

    public static double convertInchesToCentimeters(double inches) {
        return inches * 2.54;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the distance in yards: ");
        double yards = input.nextDouble();

        System.out.printf("The distance in yards is %f\n", yards);

        double feet = convertYardsToFeet(yards);
        System.out.printf("The distance in feet is %.3f\n", feet);

        double meters = convertFeetToMeters(feet);
        System.out.printf("The distance in meters is %.3f\n", meters);

        double inches = convertMetersToInches(meters);
        System.out.printf("The distance in inches is %.3f\n", inches);

        double centimeters = convertInchesToCentimeters(inches);
        System.out.printf("The distance in centimeters is %.3f\n", centimeters);

        input.close();
    }
}

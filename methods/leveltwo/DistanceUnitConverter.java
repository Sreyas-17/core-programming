package com.bridgelabz.methods.leveltwo;

import java.util.Scanner;

public class DistanceUnitConverter {
    public static double convertKmToMiles(double km) {
        double miles = km * 0.621371;
        return miles;
    }
    
    public static void convertMilesTokm(double miles) {
        double km = miles * 1.6;
        System.out.printf("\nThe distance in km coverted from miles to km %.3f: ",km);
    }
    
    public static double convertMetersToFeet(double meters) {
        double feet = meters * 1.6;
        return feet;
        
    }
    
    public static double convertFeetToMeters(double feet) {
        double meters = feet * 1.6;
        return meters;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the distance in kilometers : ");
        int kilometers = input.nextInt();
        System.out.println("The distance in km is "+kilometers);
        double miles=convertKmToMiles(kilometers);
        System.out.printf("The distance in miles is %.3f",miles);
        double feet=convertMetersToFeet(kilometers*1000);
        convertMilesTokm(miles);
        System.out.printf("\nThe distance in feet is %.3f",feet);
        System.out.printf("\nThe distance in meters is %.3f",convertFeetToMeters(feet));
        input.close();
    }
}
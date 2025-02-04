package com.bridgelabz.methods.levelone;

import java.util.*;

public class WindChillTemperature {
    public double calculateWindChill(double temperature, double windSpeed) {
        double windChill;
        windChill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
        return windChill;
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter temperature and wind speed: ");
        double temperature = input.nextDouble();
        double windSpeed = input.nextDouble();
        WindChillTemperature chill=new WindChillTemperature();
        double windChill = chill.calculateWindChill(temperature, windSpeed);
        System.out.printf("Wind chill temperature is %.3f", windChill);
        input.close();
    }

}

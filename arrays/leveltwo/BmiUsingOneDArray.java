package com.bridgelabz.arrays.leveltwo;

import java.util.Scanner;

public class BmiUsingOneDArray {
    @SuppressWarnings("resource")
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of persons : ");
        int number = input.nextInt();
        int i;
        double weight[] = new double[number];
        double height[] = new double[number];
        for (i = 0; i < number; i++) {
            System.out.print("Enter weight and height of " + (i + 1) + " person : ");
            weight[i] = input.nextDouble();
            height[i] = input.nextDouble();
            height[i] = height[i] / 100;
        }
        double bmi[] = new double[number];
        String weightStatus[] = new String[number];
        for (i = 0; i < number; i++) {
            bmi[i] = weight[i] / (height[i] * height[i]);
            if (bmi[i] <= 18.4)
                weightStatus[i] = "Person is underweight";
            else if (bmi[i] >= 18.5 && bmi[i] <= 24.9)
                weightStatus[i] = "Person is normalweight";
            else if (bmi[i] >= 25.0 && bmi[i] <= 39.9)
                weightStatus[i] = "Person is overweight";
            else
                weightStatus[i] = "Person is obese";
        }
        for (i = 0; i < number; i++) {
            System.out.println("The stats of " + (i + 1) + " person are with height in meters " + height[i] + " weight "
                    + weight[i]);
            System.out.println("BMI: " + String.format("%.3f", bmi[i]) + " weightStatus :" + weightStatus[i]);

        }
        input.close();
    }
}

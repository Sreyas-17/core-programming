package com.bridgelabz.arrays.leveltwo;

import java.util.Scanner;

public class BmiUsingTwoDArray {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of persons : ");
        int number = input.nextInt();
        int i, j;
        double personData[][] = new double[number][3];
        String weightStatus[] = new String[number];
        for (i = 0; i < number; i++) {
            for (j = 0; j < 2; j++) {
                if (j == 0)
                    System.out.print("\nEnter weight of " + (i + 1) + " persons : ");
                else
                    System.out.print("\nEnter height of " + (i + 1) + " persons : ");

                personData[i][j] = input.nextDouble();
            }
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1] / 10000);
            if (personData[i][2] <= 18.4)
                weightStatus[i] = "Person is underweight";
            else if (personData[i][2] >= 18.5 && personData[i][2] <= 24.9)
                weightStatus[i] = "Person is normalweight";
            else if (personData[i][2] >= 25.0 && personData[i][2] <= 39.9)
                weightStatus[i] = "Person is overweight";
            else
                weightStatus[i] = "Person is obese";
        }
        for (i = 0; i < number; i++) {
            System.out.print("\nThe Bmi and weight status of  " + (i + 1) + " person is  : "
                    + String.format("%.3f", personData[i][2])
                    + " " + weightStatus[i]);
        }
    }
}

package com.bridgelabz.methods.leveltwo;

import java.util.*;

public class AverageOfRandomValues {
    public static int[] generateFourDigitRandomArray(int size) {
        Random random = new Random();
        int numbers[] = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = random.nextInt(1000, 9999);
        }
        return numbers;
    }

    public static double[] findAverageMinMax(int[] numbers, int size) {
        double average;
        int total = 0, minimum = numbers[0], maximum = numbers[0];
        for (int i = 0; i < size; i++) {
            total += numbers[i];
            if (numbers[i] < minimum)
                minimum = numbers[i];
            if (numbers[i] > maximum)
                maximum = numbers[i];
        }
        average = (double) total / size;
        return new double[] { average, minimum, maximum };
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = input.nextInt();
        int numbers[] = generateFourDigitRandomArray(size);
        System.out.println("The randomly generated numbers are: ");
        for (int i = 0; i < size; i++) {
            System.out.println(numbers[i]);
        }
        double values[] = findAverageMinMax(numbers, size);
        System.out.println("The randomly generated numbers average,minimum and maximum among them is: ");

        System.out.printf("Average is %.3f, Minimum is %.3f and Maximum is %.3f", values[0], values[1], values[2]);

        input.close();
    }

}

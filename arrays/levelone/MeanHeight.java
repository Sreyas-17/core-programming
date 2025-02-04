package com.bridgelabz.arrays.levelone;

import java.util.Scanner;

public class MeanHeight {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter player heights: ");
        double heights[] = new double[11];
        int i, total = 0;
        for (i = 0; i < 11; i++) {
            heights[i] = input.nextInt();
            total += heights[i];
        }
        double meanHeight = (double) total / 11;
        System.out.print("Mean height of player heights is: " + meanHeight);
        input.close();
    }
}
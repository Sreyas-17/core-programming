package com.bridgelabz.methods.levelthree;

import java.util.*;

public class ShortestTallestAndMeanOfHeightsOfPlayers {
    static void sumOfElements(int heights[]) {
        int total = 0;
        for (int i = 0; i < 11; i++) {
            total += heights[i];
        }
        System.out.println("\nThe sum of heights of players in team is " + total);
        meanHeight(total);
    }

    static void meanHeight(int total) {
        System.out.println("The mean of heights of players in team is " + total / 11);
    }

    static void shortestHeight(int heights[]) {
        int minimum = heights[0];
        for (int i = 1; i < 11; i++) {
            if (heights[i] < minimum)
                minimum = heights[i];
        }
        System.out.println("The shortest height is " + minimum);
    }

    static void tallestHeight(int heights[]) {
        int maximum = heights[0];
        for (int i = 1; i < 11; i++) {
            if (heights[i] > maximum)
                maximum = heights[i];
        }
        System.out.println("The tallest height is " + maximum);
    }

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int heights[] = new int[11];
        int i;
        Random random = new Random();
        for (i = 0; i < 11; i++) {
            heights[i] = random.nextInt(150, 250);
        }
        System.out.println("The generated heights in cm are: ");
        for (i = 0; i < 11; i++) {
            System.out.print(heights[i] + " ");
        }
        sumOfElements(heights);
        shortestHeight(heights);
        tallestHeight(heights);
        input.close();
    }
}
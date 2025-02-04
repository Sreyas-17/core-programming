package com.bridgelabz.methods.levelone;

import java.util.Scanner;

public class AthleteCoveredRounds {
    public static void numberOfRounds(int sideOne, int sideTwo, int sideThree) {
        int perimeter = sideOne + sideTwo + sideThree;
        float rounds = 5 / (float) perimeter;
        System.out.printf("The total number of rounds the athlete will run is %.2f to complete 5km", rounds);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter side1,side2 and side3 lengths: ");
        int sideOne = input.nextInt();
        int sideTwo = input.nextInt();
        int sideThree = input.nextInt();
        numberOfRounds(sideOne, sideTwo, sideThree);
        input.close();
    }
}

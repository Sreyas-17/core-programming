package com.bridgelabz.programmingelements.levelone;

import java.util.Scanner;

public class FeetToYardsAndMiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the distance in feet: ");
        int inFeet=input.nextInt();
        float inYards=(float)inFeet/3;
        float inMiles=inYards/1760;
        System.out.println("The distaance in feet is "+inFeet+" in yards is "+inYards+" in miles is "+inMiles);
        input.close();
    }
}

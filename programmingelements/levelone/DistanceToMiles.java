package com.bridgelabz.programmingelements.levelone;

import java.util.*;
public class DistanceToMiles {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the distance in km: ");
        int distanceInKilometers=input.nextInt();
        double distanceInmiles=distanceInKilometers*1.6;
        System.out.printf("The total miles is %.3f mile for the given %d km",distanceInmiles,distanceInKilometers);
    }
}

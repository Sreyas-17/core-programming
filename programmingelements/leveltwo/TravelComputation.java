package com.bridgelabz.programmingelements.leveltwo;

import java.util.*;
public class TravelComputation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter names for 3 cities: ");
        String[] cities = input.nextLine().split(" ");
        String fromCity = cities[0];
        String viaCity = cities[1];
        String toCity = cities[2];

        System.out.print("Enter the distance between first and second city: ");
        float fromCityToVia=input.nextFloat();
        input.nextLine(); 
        
        System.out.print("Enter the time taken to travel from first to second city: ");
        String[] parts = input.nextLine().split(" ");
        int hoursFromCityToVia = Integer.parseInt(parts[0]); 
        int minutesFromCityToVia = Integer.parseInt(parts[2]); 
        int timeFromCityToVia=hoursFromCityToVia*60+minutesFromCityToVia;

        System.out.print("Enter the distance between second and third city: ");
        float fromViaToDestination=input.nextFloat();
        input.nextLine(); 

        System.out.print("Enter the time taken and distance to travel from second to third city: ");
        String[] secondParts = input.nextLine().split(" ");
        int hoursFromViaToDestination = Integer.parseInt(secondParts[0]); 
        int minutesFromViaToDestination = Integer.parseInt(secondParts[2]); 
        int timeFromViaToDestination=hoursFromViaToDestination*60+minutesFromViaToDestination;

        float totalDistance=fromCityToVia+fromViaToDestination;
        int totalTime=timeFromCityToVia+timeFromViaToDestination;

        System.out.println("The Total Distance travelled by from " + fromCity + " to " + toCity + " via " + viaCity + " is " + totalDistance + " km and " +
                         "the Total Time taken is " + totalTime + " minutes");

        input.close();

    }
}

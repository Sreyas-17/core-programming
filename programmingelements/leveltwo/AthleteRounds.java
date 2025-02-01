package com.bridgelabz.programmingelements.leveltwo;

import java.util.*;
public class AthleteRounds {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter side1,side2 and side3 lengths: ");
        int side1=input.nextInt();
        int side2=input.nextInt();
        int side3=input.nextInt();
        int perimeter=side1+side2+side3;
        float rounds=5/(float)perimeter;
        System.out.printf("The total number of rounds the athlete will run is %.2f to complete 5km",rounds);
        input.close();
    }
}

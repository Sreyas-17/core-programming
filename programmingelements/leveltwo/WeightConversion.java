package com.bridgelabz.programmingelements.leveltwo;

import java.util.*;
public class WeightConversion {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the weight in pounds: ");
        float inPounds=input.nextFloat();
        System.out.printf("The weight of the person in pound is %.2f and in kg is %.2f ",inPounds,inPounds*2.2);
        input.close();
    }
}
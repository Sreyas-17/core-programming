package com.bridgelabz.programmingelements.levelone;

import java.util.*;
public class HeightConversion {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the height in cm: ");
        int heightInCm=input.nextInt();
        double heightInInch=(double)heightInCm*2.54;
        double heightInFoot=heightInInch*12;
        System.out.printf("Your Height in cm is %d while in feet is %.3f and inches is %.3f",heightInCm,heightInFoot,heightInInch);
    }
}

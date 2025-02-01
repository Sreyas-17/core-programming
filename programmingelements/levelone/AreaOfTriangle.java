package com.bridgelabz.programmingelements.levelone;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter base and height: ");
        int baseInCm=input.nextInt();
        int heightInCm=input.nextInt();
        double heightInInch=(double)heightInCm*2.54;
        double baseInInch=(double)baseInCm*2.54;
        double areaInCm=0.5*baseInCm*heightInCm;
        double areaInInch=0.5*baseInInch*heightInInch;
        System.out.printf("Area in cm2 %.3f and square inches %.3f: ",areaInCm,areaInInch);
        input.close();
    }
}

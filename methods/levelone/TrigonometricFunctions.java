package com.bridgelabz.methods.levelone;

import java.util.Scanner;


public class TrigonometricFunctions {

    public double[] calculateTrigonometricFunctions(double angle){
        return new double[]{Math.sin(angle),Math.cos(angle),Math.tan(angle)};
    }

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter the angle: ");
        double angle = input.nextDouble();
        angle=Math.toRadians(angle);
        TrigonometricFunctions calculation=new TrigonometricFunctions();
        double results[]=calculation.calculateTrigonometricFunctions(angle);


        System.out.printf("The angles are: %.3f,%.3f,%.3f",results[0],results[1],results[2]);
        input.close();
    }
}

package com.bridgelabz.programmingelements.levelone;

public class PenDistribution {
    public static void main(String[] args) {
        int numberOfPens=14;
        int numberOfStudents=3;
        double distribtedPens=numberOfPens/numberOfStudents;
        int remainingPens=numberOfPens%numberOfStudents;
        System.out.println("The Pen Per Student is "+distribtedPens+" and the remaining pen not distributed is "+remainingPens);
    }
}

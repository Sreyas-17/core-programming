package com.bridgelabz.programmingelements.levelone;

public class VolumeOfEarth {
    public static void main(String[] args) {
        int radius=6378;
        double volumeOfSphere=(4.0/3)*3.14*(Math.pow(radius,3));
        double radiusMiles=6378/1.6;
        double volumeOfSphereMiles=(4.0/3)*3.14*(Math.pow(radiusMiles,3));
        System.out.printf("The volume of earth in cubic kilometers is %.3f and cubic miles is %.3f%n", volumeOfSphere, volumeOfSphereMiles);
    }
}

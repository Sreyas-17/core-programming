package com.bridgelabz.methods.levelone;

import java.util.*;

public class SimpleInterest {
    public static void calculateSimpleInterest(int principal,int rate,int time){
        double simpleInterest=((double)principal*rate*time)/100;
        System.out.printf(" The Simple Interest is %.3f for Principal %d, Rate of Interest %d and Time %d",simpleInterest,principal,rate,time);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the principal,rate and time: ");
        int principal = input.nextInt();
        int rate = input.nextInt();
        int time = input.nextInt();
        calculateSimpleInterest(principal, rate, time);
        input.close();
    }
}
package com.bridgelabz.methods.levelone;

import java.util.Scanner;

public class MaximumNumberOfHandshakes {
    public static void numberOfHandshakes(int n){
        double maxHandshakes=((double)n*(n-1))/2;
        System.out.printf(" The maximum number of handshakes are: %.3f",maxHandshakes);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of people: ");
        int numberOfPeople = input.nextInt();
        numberOfHandshakes(numberOfPeople);
        input.close();
    }
}

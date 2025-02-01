package com.bridgelabz.programmingelements.levelone;

import java.util.Scanner;

public class HandshakesCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();
        float maxHandshakes = ((numberOfStudents * (float) (numberOfStudents - 1)) / 2);
        System.out.println("Number of possible handshakes are: " + String.format("%.3f", maxHandshakes));
        input.close();
    }
}

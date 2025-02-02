package com.bridgelabz.controlflow.levelone;

import java.util.Scanner;

public class Largest {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the three numbers: ");
        int i;
        int vals[] = new int[3];
        for (i = 0; i < 3; i++)
            vals[0] = input.nextInt();
        int maximum = vals[0];
        for (i = 1; i < vals.length; i++) {
            if (vals[i] > maximum)
                maximum = vals[i];
        }
        System.out.printf("%d is largest", maximum);
        input.close();
    }
}

package com.bridgelabz.controlflow.levelone;

import java.util.*;

public class Divisibility {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to be checked: ");
        int number = input.nextInt();
        if (number % 5 == 0)
            System.out.println("The number " + number + " is divible by 5");
        input.close();
    }
}
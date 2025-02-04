package com.bridgelabz.methods.leveltwo;

import java.util.Scanner;

public class Quadratic {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter co-efficients a,b and c : ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        double delta = Math.pow(b, 2) -  4 * a * c;
        if (delta > 0) {
            double rootOne = ( -b + Math.sqrt(delta)) / (2 * a);
            double rootTwo = ( -b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("The roots are %.3f and %.3f", rootOne ,rootTwo);
        } else if (delta == 0) {
            double root = ((double) -b) / (2 * a);
            System.out.printf("The roots are %.3f and %.3f" , root, root);
        } else
            System.out.println("The roots are negative");
        input.close();
    }
}

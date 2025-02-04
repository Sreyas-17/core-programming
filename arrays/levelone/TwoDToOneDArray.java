package com.bridgelabz.arrays.levelone;

import java.util.*;

public class TwoDToOneDArray {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter rows and columns: ");
        int rows = input.nextInt();
        int columns = input.nextInt();
        int twoD[][] = new int[rows][columns];
        int oneD[] = new int[rows*columns];
        int i, j, k = 0;
        System.out.println("Enter values for 2D array: ");
        for (i = 0; i < rows; i++) {
            for (j = 0; j < columns; j++) {
                twoD[i][j] = input.nextInt();
            }
        }
        for (i = 0; i < rows; i++) {
            for (j = 0; j < columns; j++) {
                oneD[k++] = twoD[i][j];
            }
        }
        System.out.println("Values in 1D array: ");
        for (i = 0; i < rows*columns; i++) {
            System.out.print(oneD[i] + " ");
        }
    }

}

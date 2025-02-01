package com.bridgelabz.programmingelements.levelone;

import java.util.Scanner;
public class SquarePerimeter {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
      System.out.print("Enter length of the square side: ");
      int sideLength = input.nextInt();
      int perimeter = 4*sideLength;
      System.out.printf("The length of the side is %d whose perimeter is %d",sideLength,perimeter);
      input.close();
    }
}

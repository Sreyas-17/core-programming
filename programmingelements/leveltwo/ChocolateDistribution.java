package com.bridgelabz.programmingelements.leveltwo;

import java.util.*;
public class ChocolateDistribution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter number of chocolates and number of children: ");
        int numberOfChocolates=input.nextInt();
        int numberOfChildren=input.nextInt();
        int childGets=numberOfChocolates/numberOfChildren;
        int remainingChocolates=numberOfChocolates%numberOfChildren;
        System.out.printf("The number of chocolates each child gets is %d and the number of remaining chocolates are %d",childGets,remainingChocolates);
        input.close();
    }
}

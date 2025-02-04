package com.bridgelabz.methods.levelone;

import java.util.Scanner;

public class ChocolateDistribution {
    public static int[] findRemainderAndQuotient(int number, int divisor){
        int childGets=number/divisor;
        int remainingChocolates=number%divisor;
        return new int[]{childGets,remainingChocolates};
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter number of chocolates and number of children: ");
        int numberOfChocolates=input.nextInt();
        int numberOfChildren=input.nextInt();
        int results[]={0,0};
        if (numberOfChildren > 0) {
            results = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);
        }
        System.out.println("Number of chocolates each child gets is " + results[0]);
        System.out.println("Number of remaining chocolates " + results[1]);

        input.close();
    }
}

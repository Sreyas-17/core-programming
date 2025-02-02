package com.bridgelabz.controlflow.levelone;

import java.util.*;
public class NaturalNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = input.nextInt();
        if(number>0){
            System.out.println(number+" is a natural number");
        }
        int sumOfNumbers=number*(number+1)/2;
        System.out.println("The sum of "+number+" natural numbers is "+sumOfNumbers);
        input.close();
    }
}

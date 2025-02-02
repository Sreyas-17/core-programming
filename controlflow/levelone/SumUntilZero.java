package com.bridgelabz.controlflow.levelone;

import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        double number = input.nextDouble();
        double new_number=number;
        while(new_number==0){
            System.out.print("Enter number other than 0: ");
            new_number = input.nextDouble();
        }
        double total=new_number*(new_number+1)/2;
        System.out.print("The sum till user entered number is "+total);
        input.close();
    }
}

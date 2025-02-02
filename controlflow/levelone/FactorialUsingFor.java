package com.bridgelabz.controlflow.levelone;

import java.util.Scanner;

public class FactorialUsingFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        int factorial=1;
        if(number>=0){
            for(int i=number;i>0;i--){
                factorial*=number;
                number--;
            }
            System.out.println("Factorial of given number is : "+factorial);
        }
        else{
            System.out.print("Entered number is a negative value");
        }
        input.close();
    }
}

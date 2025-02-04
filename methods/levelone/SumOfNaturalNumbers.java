package com.bridgelabz.methods.levelone;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void calculateSum(int number){
        int total=0;
        int result=number*(number+1)/2;
        for(int i=number;i>0;i--){
            total+=number;
            number--;
        }
        System.out.println("The sum using formula is "+result+" the sum using for loop is "+total);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        calculateSum(number);
        input.close();
    }
}

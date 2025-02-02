package com.bridgelabz.controlflow.levelone;

import java.util.Scanner;

public class SumOfNumbersUsingFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        int total=0;
        int result=number*(number+1)/2;
        for(int i=number;i>0;i--){
            total+=number;
            number--;
        }
        System.out.println("The sum using formula is "+result+" the sum using for loop is "+total);
        input.close();
    }
}

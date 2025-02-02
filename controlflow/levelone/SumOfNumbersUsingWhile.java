package com.bridgelabz.controlflow.levelone;

import java.util.*;
public class SumOfNumbersUsingWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        int total=0;
        int result=number*(number+1)/2;
        while(number>0){
            total+=number;
            number--;
        }
        System.out.println("The sum using formula is "+result+" the sum using while loop is "+total);
        input.close();
    }
}

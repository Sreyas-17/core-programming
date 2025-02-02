package com.bridgelabz.controlflow.levelone;

import java.util.Scanner;

public class NumberChecker {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = input.nextInt();
        if(number==0){
            System.out.println(number+" is zero");
        }
        else if (number>0){
            System.out.println(number+" is positive");
        }
        else{
            System.out.println(number+" is negative");
        }
        input.close();
    }
}

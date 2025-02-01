package com.bridgelabz.programmingelements.levelone;

import java.util.Scanner;
public class BasicCalculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter number1 and number2: ");
        double number1=input.nextDouble();
        double number2=input.nextDouble();
        double addition=number1+number2;
        double subtraction=number1-number2;
        double multiplication=number1*number2;
        double division=number1/number2;
        System.out.printf("The addition, subtraction, multiplication and division value of 2 numbers %f and %f is ,%.3f,%.3f ,%.3f  and %.3f",number1,number2,addition,subtraction,multiplication,division);
        input.close();
    }
}

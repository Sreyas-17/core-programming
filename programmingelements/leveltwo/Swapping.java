package com.bridgelabz.programmingelements.leveltwo;

import java.util.*;
public class Swapping {
    public static void main(String[] args) {
        System.out.print("Enter two numbers:");
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        number1=number1+number2;
        number2=number1-number2;
        number1=number1-number2;
        System.out.println("The swapped number are: "+number1+" "+number2);
        input.close();
    }
}

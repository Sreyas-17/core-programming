package com.bridgelabz.controlflow.levelthree;

import java.util.Scanner;

public class Calculator {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two number: ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        System.out.print("Enter the operator: ");
        char operator = input.next().charAt(0);
        switch (operator) {
            case '+':
                System.out.println("The sum of given two numbers is " + (number1 + number2));
                break;
            case '-':
                System.out.println("The difference between given two numbers is " + (number1 - number2));
                break;
            case '*':
                System.out.println("The multiplication of given two numbers is " + (number1 * number2));
                break;
            case '/':
                if (number2 != 0)
                    System.out.println("The divison of given two numbers is " + (number1 / number2));
                else
                    System.out.println("Can't divide with 0");
                break;
            default:
                System.out.println("Invald operator");
        }
        input.close();
    }
}

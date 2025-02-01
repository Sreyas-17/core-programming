package com.bridgelabz.programmingelements.leveltwo;

import java.util.Scanner;
public class DivisonAndModulus {
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        System.out.print("Enter number1 and number2: ");
        int number1=input.nextInt();
        int number2=input.nextInt();
        float quotient=(float)number1/number2;
        int remainder=number1%number2;
        System.out.println("The Quotient is "+quotient+" and remainder is "+remainder+" of two number "+number1+" and "+number2);
        input.close();
    }
}

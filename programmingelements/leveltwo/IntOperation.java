package com.bridgelabz.programmingelements.leveltwo;

import java.util.Scanner;
public class IntOperation {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a,b and c values: ");
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        int operationOne=a+b*c;
        int operationTwo=a*b+c;
        int operationThree=c+a/b;
        int operationFour=a%b+c;
        System.out.println("The results of int operations are : "+operationOne+","+operationTwo+","+operationThree+" and "+operationFour);
        input.close();
    }
}

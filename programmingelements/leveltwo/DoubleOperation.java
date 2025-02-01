package com.bridgelabz.programmingelements.leveltwo;

import java.util.*;

public class DoubleOperation {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a,b and c values: ");
        double a=input.nextDouble();
        double b=input.nextDouble();
        double c=input.nextDouble();
        double operationOne=a+b*c;
        double operationTwo=a*b+c;
        double operationThree=c+a/b;
        double operationFour=a%b+c;
        System.out.println("The results of int operations are : "+operationOne+","+operationTwo+","+operationThree+" and "+operationFour);
        input.close();
    }
}

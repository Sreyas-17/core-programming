package com.bridgelabz.programmingelements.leveltwo;

import java.util.*;
public class TotalIncome {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter salary: ");
        int salary=input.nextInt();
        System.out.print("Enter bonus: ");
        int bonus=input.nextInt();
        System.out.println("The salary is INR "+salary+" and bonus is INR "+bonus+" Hence total income is INR "+(salary+bonus));
        input.close();
    }    
}

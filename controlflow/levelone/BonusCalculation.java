package com.bridgelabz.controlflow.levelone;

import java.util.Scanner;

public class BonusCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the salary and years of service : ");
        int salary = input.nextInt();
        int service = input.nextInt();
        if(service>5){
            int bonus=salary*5/100;
            int total=bonus+salary;
            System.out.println("Bonus amount is "+bonus+" total salary is "+total);
        }
        else
        System.out.println("There is no bonus so total salary is "+salary);
        input.close();
    }
}

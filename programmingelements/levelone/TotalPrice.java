package com.bridgelabz.programmingelements.levelone;

import java.util.Scanner;

public class TotalPrice {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the unitprice and quantity: ");
        int unitPrice=input.nextInt();
        int quantity=input.nextInt();
        int totalPurchase=unitPrice*quantity;
        System.out.println("The total purchase price is INR "+totalPurchase+" if the quantity "+quantity+" and unitprice is INR "+unitPrice);
        input.close();
    }
}

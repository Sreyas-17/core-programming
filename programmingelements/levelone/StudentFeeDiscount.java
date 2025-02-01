package com.bridgelabz.programmingelements.levelone;

import java.util.*;
public class StudentFeeDiscount {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the fee and discount values: ");
        String values[]=input.nextLine().split(" ");
        int fee=Integer.parseInt(values[0]);
        double discountPercent=Double.parseDouble(values[1]);
        double discoutedPrice=fee-(fee*(double)discountPercent/100);
        double discoutedAmount=(fee*(double)discountPercent/100);
        System.out.println("The discount amount is INR "+discoutedAmount+" and final discounted fee is INR "+discoutedPrice);
    }
}

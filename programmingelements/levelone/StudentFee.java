package com.bridgelabz.programmingelements.levelone;

public class StudentFee {
    public static void main(String[] args) {
        int fee=125000;
        int discountPercent=10;
        double discoutedPrice=fee-(fee*(double)discountPercent/100);
        double discoutedAmount=(fee*(double)discountPercent/100);
        System.out.println("The discount amount is INR "+discoutedAmount+" and final discounted fee is INR "+discoutedPrice);
    }
}

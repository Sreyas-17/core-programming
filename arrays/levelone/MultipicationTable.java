package com.bridgelabz.arrays.levelone;

import java.util.Scanner;

public class MultipicationTable {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        input.close();
        int i;
        for(i=1;i<=10;i++){
            System.out.printf("%d * %d = %d\n",number,i,(number*i));
        }
    }
}

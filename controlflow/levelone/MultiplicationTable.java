package com.bridgelabz.controlflow.levelone;

import java.util.*;
public class MultiplicationTable {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        for(int i=1;i<=10;i++){
            System.out.printf("%d * %d = %d \n",number,i,number*i);
        }
        input.close();
    }
}

package com.bridgelabz.controlflow.levelone;

import java.util.Scanner;

public class CounterUsingFor {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the counter: ");
        int counter = input.nextInt();
        for(int i=counter;i>0;i--){
            System.out.print(i+" ");
        }
        input.close();
    }
}

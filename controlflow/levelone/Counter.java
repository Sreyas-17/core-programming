package com.bridgelabz.controlflow.levelone;

import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the counter: ");
        int counter = input.nextInt();
        counter+=1;
        while(counter-->1){
            System.out.print(counter+" ");
        }
        input.close();
    }
}

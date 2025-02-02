package com.bridgelabz.controlflow.levelone;

import java.util.*;
public class VotingRequirement {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the age to be checked: ");
        int age = input.nextInt();
        if(age>=18)
        System.out.println("The persone can vote");
        else
        System.out.println("tthe person cannot vote");
        input.close();
    }
}

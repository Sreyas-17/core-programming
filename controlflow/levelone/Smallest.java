package com.bridgelabz.controlflow.levelone;

import java.util.*;

public class Smallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the three numbers: ");
        String vals[]=input.nextLine().split(" ");
        int minimum=Integer.parseInt(vals[0]);
        for(int i=1;i<vals.length;i++){
            if (Integer.parseInt(vals[i])<minimum)
            minimum=Integer.parseInt(vals[i]);
        }
        System.out.printf("%d is smallest", minimum);
        input.close();
    }
}

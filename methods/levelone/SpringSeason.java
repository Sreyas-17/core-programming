package com.bridgelabz.methods.levelone;

import java.util.Scanner;

public class SpringSeason {
    public static void springSeasonCheck(int month,int day) {
        if (month>=3 && month<=6){
            if(month==3 && day>=20 || month==6 &&day<=20 || month==4 ||month==5){
                System.out.println("Its a Spring Season");
            }
            else{
                System.out.println("Its not a Spring Season");
            }
        }
        else{
            System.out.println("Its not a Spring Season");
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the month and day: ");
        int month=input.nextInt();
        int day=input.nextInt();
        springSeasonCheck(month, day);
        input.close();
    }    
    
}

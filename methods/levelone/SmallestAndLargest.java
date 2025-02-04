package com.bridgelabz.methods.levelone;

import java.util.*;

public class SmallestAndLargest {

    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int smallest = number1;
        int largest = number1;
        if (number2 < smallest)
            smallest = number2;
        if (number3 < smallest)
            smallest = number3;
        if (number2 > largest)
            largest = number2;
        if (number3 > largest)
            largest = number3;
        
            return new int[]{smallest,largest};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 3 numbers : ");
        int numberOne = input.nextInt();
        int numberTwo = input.nextInt();
        int numberThree = input.nextInt();
        int findings[] = findSmallestAndLargest(numberOne, numberTwo, numberThree);

        System.out.println("The smallest number is " + findings[0]);
        System.out.println("The largest number is " + findings[1]);

        input.close();
    }
}

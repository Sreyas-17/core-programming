package com.bridgelabz.arrays.leveltwo;

import java.util.*;
public class FrequencyOfDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<Integer, Integer> digitFrequency = new HashMap<Integer, Integer>();
        System.out.println("Enter the number: ");
        int number = input.nextInt();
        int result = 0, digit;
        while (number > 0) {
            result += 1;
            digit = number % 10;
            digitFrequency.put(digit, digitFrequency.getOrDefault(digit, 0) + 1);
            number /= 10;
        }
        for (Map.Entry<Integer, Integer> i : digitFrequency.entrySet()) {
            System.out.println(+i.getKey() + " " + i.getValue());
        }
        System.out.println("Total number of digits are " + result);
        input.close();
    }
}

import java.util.*;

public class NumberChecker {
    static int countDigits(int number) {
        int count = 0;
        while (number > 0) {
            count += 1;
            number /= 10;
        }
        return count;

    }

    static int[] storeDigits(int size, int number) {
        int digits[] = new int[size];
        int i = 0;
        while (number > 0) {
            digits[i] = number % 10;
            number /= 10;
            i++;
        }
        System.out.println("The number of digits in the number is " + size);
        System.out.println("The digits in the number is ");
        for (i = 0; i < size; i++) {
            System.out.print(digits[i] + " ");
        }
        return digits;
    }

    static void checkForDuck(int digits[], int size) {
        for (int i = 0; i < size; i++) {
            if (digits[i] != 0) {
                System.out.println("The given number is duck number");
                break;
            }
        }
    }

    static void checkForArmstrongNumber(int number) {
        int result = 0;
        int quotient = number;
        while (quotient > 0) {
            int remainder = quotient % 10;
            result += (int) (Math.pow(remainder, 3));
            quotient = quotient / 10;
        }
        if (number == result)
            System.out.println("\nThe number is armstrong");
        else
            System.out.println("\nThe number is not armstrong");
    }

    static void findLargestAndSecondLargest(int numbers[], int size) {
        int maximum = -1;
        int secondLargest = -1;
        for (int i = 0; i < size; i++) {
            if (numbers[i] > maximum) {
                secondLargest = maximum;
                maximum = numbers[i];
            } else if (numbers[i] > secondLargest && numbers[i] != maximum) {
                secondLargest = numbers[i];
            }
        }
        System.out.println("The largest and second largest number is: " + maximum + " " + secondLargest);
    }

    static void findSmallestAndSecondSmallest(int numbers[], int size) {
        int minimum = numbers[0];
        int secondSmallest = numbers[0];
        for (int i = 0; i < size; i++) {
            if (numbers[i] < minimum) {
                secondSmallest = minimum;
                minimum = numbers[i];
            } else if (numbers[i] < secondSmallest && numbers[i] != minimum) {
                secondSmallest = numbers[i];
            }
        }
        System.out.println("The smallest and second smallest number is: " + minimum + " " + secondSmallest);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = input.nextInt();
        int numberOfDigits = countDigits(number);
        int numbers[] = storeDigits(numberOfDigits, number);
        checkForArmstrongNumber(numberOfDigits);
        findLargestAndSecondLargest(numbers, numberOfDigits);
        findSmallestAndSecondSmallest(numbers, numberOfDigits);
        input.close();
    }
}

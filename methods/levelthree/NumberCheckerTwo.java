import java.util.Scanner;

public class NumberCheckerTwo {
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

    static void sumOfDigits(int digits[], int size) {
        int total = 0, i;
        for (i = 0; i < size; i++) {
            total += digits[i];
        }
        System.out.println("\nThe sum of digits is " + total);
    }

    static void sumOfSquaresOfDigits(int digits[], int size) {
        int total = 0, i;
        for (i = 0; i < size; i++) {
            total += Math.pow(digits[i], 2);
        }
        System.out.println("The sum of squares of digits is " + total);
    }

    static void checkHarshadNumber(int number) {
        int result = 0;
        int quotient = number;
        while (quotient > 0) {
            int remainder = quotient % 10;
            result += remainder;
            quotient = quotient / 10;
        }
        if (number % result == 0)
            System.out.println(number + " is a Harshad number");
        else
            System.out.println(number + " is not a Harshad number");
    }

    static void findFrequency(int digits[], int size) {
        int frequency[][] = new int[10][2];
        int i;
        for (i = 0; i < 10; i++) {
                frequency[i][0] = i;
        }
        for (i = 0; i < size; i++) {
            frequency[digits[i]][1] ++;
        }
        for (i = 0; i < 10; i++) {
            if(frequency[i][1]>0)
                System.out.println(frequency[i][0]+" " +frequency[i][1]);
            }
        }

        
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = input.nextInt();
        int numberOfDigits = countDigits(number);
        int numbers[] = storeDigits(numberOfDigits, number);
        sumOfDigits(numbers, numberOfDigits);
        sumOfSquaresOfDigits(numbers, numberOfDigits);
        checkHarshadNumber(number);
        findFrequency(numbers, numberOfDigits);
        input.close();
    }
}

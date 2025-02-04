import java.util.Scanner;

public class NumberCheckerFive {
    public static int[] findFactors(int number) {
        int[] factors = new int[number];
        int count = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[count++] = i;
            }
        }

        return factors;
    }

    public static int findGreatestFactor(int[] factors) {
        return factors[factors.length - 1];
    }

    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    public static double productOfCubeOfFactors(int[] factors) {
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    public static void checkForPerfectNumber(int number) {
        int[] factors = findFactors(number);
        int sum = sumOfFactors(factors) - number;
        if (number==sum)
            System.out.println(number+" is Perfect Number" );
        else
            System.out.println(number+" is not Perfect Number" );
    }

    public static void checkForAbundantNumber(int number) {
        int[] factors = findFactors(number);
        int sum = sumOfFactors(factors) - number;
        if(sum > number)
            System.out.println(number + " is Abundant Number" );
        else
            System.out.println(number + " is not Abundant Number" );

    }

    public static void checkForDeficientNumber(int number) {
        int[] factors = findFactors(number);
        int sum = sumOfFactors(factors) - number;
        if(sum < number)
            System.out.println(number+" is Deficient Number");
        else
            System.out.println(number+" is not Deficient Number");
    }

    public static void checkForStrongNumber(int number) {
        int sum = 0;
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        if(sum == number)
            System.out.println(number+" is Strong Number");
        else
            System.out.println(number+" is not Strong Number");
    }

    private static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        int[] factors = findFactors(number);
        System.out.println("Factors of " + number + ": " + java.util.Arrays.toString(factors));

        System.out.println("Greatest Factor: " + findGreatestFactor(factors));
        System.out.println("Sum of Factors: " + sumOfFactors(factors));
        System.out.println("Product of Factors: " + productOfFactors(factors));
        System.out.println("Product of Cube of Factors: " + productOfCubeOfFactors(factors));
        checkForPerfectNumber(number);
        checkForAbundantNumber(number);
        checkForDeficientNumber(number);
        checkForStrongNumber(number);
    }
}
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        int check = 0;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                System.out.println(number + " is not prime number");
                check = 1;
                break;
            }
        }
        if (check == 0)
            System.out.println(number + " is a prime number");
        input.close();
    }
}

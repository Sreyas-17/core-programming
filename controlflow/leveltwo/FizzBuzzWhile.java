import java.util.Scanner;

public class FizzBuzzWhile {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        int i = 0;
        if (number >= 0) {
            while (i <= number) {
                if (i % 3 == 0 && i % 5 == 0)
                    System.out.println("FizzBuzz");
                else if (i % 5 == 0)
                    System.out.println("Buzz");
                else if (i % 3 == 0)
                    System.out.println("Fizz");
                else
                    System.out.println(i);
                i++;
            }
        } else
            System.out.println("Enter a positive value");
        input.close();
    }

}
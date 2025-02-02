import java.util.Scanner;

public class GreatestFactor {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = input.nextInt();
        for (int i = number - 1; i > 0; i--) {
            if (number % i == 0) {
                System.out.println("The greatest factor after itself is " + i);
                break;
            }
        }
        input.close();
    }
}

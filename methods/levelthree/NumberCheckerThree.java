import java.util.Scanner;

public class NumberCheckerThree {
    static int countDigits(int number) {
        int count = 0;
        while (number > 0) {
            count += 1;
            number /= 10;
        }
        return count;

    }

    static int[] storeDigits(int size, int number) {
        int[] digits = new int[size];
        int i = size - 1;
        while (number > 0) {
            digits[i] = number % 10;
            number /= 10;
            i--;
        }
        System.out.println("The number of digits in the number is " + size);
        System.out.println("The digits in the number is ");
        for (i = 0; i < size; i++) {
            System.out.print(digits[i] + " ");
        }
        return digits;
    }

    static int[] reverseTheDigits(int digits[], int size) {
        int i = 0, j = size - 1;
        while (i <j) {
            int temp;
            temp = digits[j];
            digits[j] = digits[i];
            digits[i] = temp;
            i++;
            j--;
        }
        System.out.println("\nThe reversed array is: ");
        for (i = 0; i < size; i++)
            System.out.println(digits[i]);
        return digits;
    }
    static void checkForEqualArray(int[] digits,int[] reverseDigits,int size){
        int check=0;
        for(int i=0;i<size;i++){
            if(digits[i]!=reverseDigits[i]){
                check=1;
                System.out.println("Both arrays are not equal");
                break;
            }
        }
        if (check==0){
            System.out.println("Both arrays are equal");
        }
    }

    static void palindromeCheck(int number,int size){
        int n=number,remainder;
        int reversedNumber=0;
        while(n>0){
            remainder=n%10;
            reversedNumber=reversedNumber*10+remainder;
            n/=10;
        }
        if(number!=reversedNumber)
            System.out.println("The number is not palindrome");
            else
            System.out.println("The number is palindrome");
        }
    static void checkForDuck(int digits[], int size) {
        for (int i = 0; i < size; i++) {
            if (digits[i] != 0) {
                System.out.println("The given number is duck number");
                break;
            }
        }
    }
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = input.nextInt();
        int numberOfDigits = countDigits(number);
        int digits[] = storeDigits(numberOfDigits, number);
        int reverseDigits[]=reverseTheDigits(digits.clone(), numberOfDigits);
        checkForEqualArray(digits, reverseDigits,numberOfDigits);
        palindromeCheck(number,numberOfDigits);
        checkForDuck(digits, numberOfDigits);
        input.close();

    }
}

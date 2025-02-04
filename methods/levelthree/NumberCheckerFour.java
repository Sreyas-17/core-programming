import java.util.*;
public class NumberCheckerFour {
    static void primeNumberCheck (int number){
        boolean isPrime=false;
        for(int i=2;i<Math.sqrt(number);i++){
            if(number%i==0){
                System.out.println("The number is NOT PRIME");
                isPrime=true;
                break;
            }
        }
        if(!isPrime){
            System.out.println("The number is PRIME");
        }
    }
    static void checkNeonNumber(int number){
        int n= (int) Math.pow(number,2),lastDigit,total=0;
        while(n>0){
            lastDigit=n%10;
            total+=lastDigit;
            n/=10;
        }
        System.out.println("The square of the number is : "+(number*number));
        System.out.println("The sum of the digits of square of the number is : "+total);
        if (number==total){
            System.out.println("The number is NEON NUMBER");
        }
        else{
            System.out.println("The number is not NEON NUMBER");
        }
    }
    static void checkSpyNumber(int number){
        int n=number,lastDigit,total=0,product=1;
        while(n>0){
            lastDigit=n%10;
            total+=lastDigit;
            product*=lastDigit;
            n/=10;
        }
        System.out.println("The sum of the digits of the number is : "+total);
        System.out.println("The product of the digits of the number is : "+product);
        if(total==product){
            System.out.println("The number is SPY NUMBER");
        }
        else{
            System.out.println("The number is not SPY NUMBER");
        }

    }
    static void checkForAutomorphicNumber(int number){
        int squareNumber=number*number;
        int lastDigit=number%10;
        int squareNumberLastDigit=squareNumber%10;
        if(lastDigit==squareNumberLastDigit){
            System.out.println("The number is Automorphic Number");
        }
        else{
            System.out.println("The number is not Automorphic Number");
        }
    }
    static void checkForBuzzNumber(int number){
        if (number%7==0 || number%10==7){
            System.out.println("The number is Buzz Number");
        }
        else{
            System.out.println("The number is not Buzz Number");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int number=sc.nextInt();
        primeNumberCheck(number);
        checkNeonNumber(number);
        checkSpyNumber(number);
        checkForAutomorphicNumber(number);
        checkForBuzzNumber(number);
        sc.close();
    }
}

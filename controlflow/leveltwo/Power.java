import java.util.Scanner;

public class Power {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base and power : ");
        int base = input.nextInt();
        int power = input.nextInt();
        int result=base;
        for(int i=0;i<power-1;i++)
        result*=base;
        System.out.print("result is  : "+result);
        input.close();
    }
}

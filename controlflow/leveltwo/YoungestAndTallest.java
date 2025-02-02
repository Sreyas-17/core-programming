import java.util.Scanner;

public class YoungestAndTallest {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int i = 0;
        System.out.print("Enter ages of 3 persons : ");
        int age[] = new int[3];
        for (i = 0; i < 3; i++)
            age[i] = input.nextInt();
        System.out.print("Enter heights of 3 persons : ");
        double height[] = new double[3];
        for (i = 0; i < 3; i++)
            height[i] = input.nextDouble();
        int youngest = age[0];
        for (i = 0; i < 3; i++) {
            if (age[i] < youngest)
                youngest = age[i];
        }
        double tallest = height[0];
        for (i = 0; i < 3; i++) {
            if (height[i] > tallest)
                tallest = height[i];
        }
        System.out.println("The youngest one is " + youngest);
        System.out.println("The tallest one is " + tallest);
        input.close();
    }
}

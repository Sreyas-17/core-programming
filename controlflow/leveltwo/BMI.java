import java.util.Scanner;

public class BMI {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight and height of a person : ");
        double weight = input.nextDouble();
        double height = input.nextDouble();
        double heightInMeters = height / 100;
        double bmi = weight / (heightInMeters * heightInMeters);
        if (bmi <= 18.4)
            System.out.println("Person is underweight");
        else if (bmi >= 18.5 && bmi <= 24.9)
            System.out.println("Person is normalweight");
        else if (bmi >= 25.0 && bmi <= 39.9)
            System.out.println("Person is overweight");
        else
            System.out.println("Person is obese");
        input.close();
    }
}

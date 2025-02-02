import java.util.Scanner;

public class Grade {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the marks of physics,chemistry and maths: ");
        int physics = input.nextInt();
        int chemistry = input.nextInt();
        int maths = input.nextInt();
        double percentage = ((double) physics + chemistry + maths) / 300 * 100;
        System.out.println("Student acheived "+percentage+"%");
        if (percentage >= 80)
            System.out.println("Level 4, above agency-normalized standards");
        else if (percentage >= 70)
            System.out.println("Level 3, at agency-normalized standards");
        else if (percentage >= 60)
            System.out.println("Level 2, below, but approaching agency-normalized standards");
        else if (percentage >= 50)
            System.out.println("Level 1, well below agency-normalized standards");
        else if (percentage >= 40)
            System.out.println("Level 1-, too below agency-normalized standards");
        else
            System.out.println("Remedial standard");
        input.close();
    }
}

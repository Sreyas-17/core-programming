package com.bridgelabz.arrays.leveltwo;

import java.util.Scanner;

public class StudentGradeUsingTwoDArray {
    @SuppressWarnings("resource")
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students : ");
        int numberOfStudents = input.nextInt();
        int i, j;
        double studentMarks[][] = new double[numberOfStudents][3];
        double percentage[] = new double[numberOfStudents];
        String grade[] = new String[numberOfStudents];
        for (i = 0; i < numberOfStudents; i++) {
            double total = 0;
            System.out.print("\nEnter three subjects marks of " + (i + 1) + " students : ");
            for (j = 0; j < 3; j++) {
                studentMarks[i][j] = input.nextDouble();
                total += studentMarks[i][j];
            }
            percentage[i] = total / 300 * 100;
            if (percentage[i] >= 80)
                grade[i] = "Level 4, above agency-normalized standards";
            else if (percentage[i] >= 70)
                grade[i] = "Level 3, at agency-normalized standards";
            else if (percentage[i] >= 60)
                grade[i] = "Level 2, below, but approaching agency-normalized standards";
            else if (percentage[i] >= 50)
                grade[i] = "Level 1, well below agency-normalized standards";
            else if (percentage[i] >= 40)
                grade[i] = "Level 1-, too below agency-normalized standards";
            else
                grade[i] = "Remedial standard";

            System.out.println("\nThe percentage and grade of student " + (i + 1) + " is");
            System.out.printf("%.3f and %s", percentage[i], grade[i]);

        }
        input.close();
    }
}

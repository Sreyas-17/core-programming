package com.bridgelabz.arrays.leveltwo;

import java.util.Scanner;

public class StudentGrade {
    @SuppressWarnings("resource")
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students : ");
        int numberOfStudents = input.nextInt();
        int i=0;
        double marks[] = new double[3];
        double percentage[] = new double[numberOfStudents];
        String grade[] = new String[numberOfStudents];
        while (numberOfStudents-- > 0) {
            double total = 0;
            System.out.print("Enter marks of " + (i + 1) + " student : ");
            for (int j = 0; j < 3; j++) {
                marks[j] = input.nextDouble();
                total += marks[j];
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
                grade[i]="Remedial standard";
            System.out.println("\nThe percentage and grade of student "+(i+1)+" is");
            System.out.printf("%.3f and %s",percentage[i],grade[i]);
            i++;
        }
    }
}

import java.util.*;
public class EmployeeBonus {
    public static double[][] determineSalary() {
        double salaryAndService[][] = new double[10][2];
        int i, j;
        Random random = new Random();
        for (i = 0; i < 10; i++) {
                salaryAndService[i][0] = random.nextDouble(10000, 99999);
                salaryAndService[i][1] = (int)random.nextInt(0,60);
        }
        return salaryAndService;
    }public static double[][] determineNewSalary(double stats[][]) {
        double newStats[][] = new double[10][2];
        int i;
        for (i = 0; i < 10; i++) {
            if (stats[i][1] > 5) {
                newStats[i][0] = stats[i][0]+stats[i][0] * 5 / 100;
                newStats[i][1] = stats[i][1] * 5/100;
            } else {
                newStats[i][0] = stats[i][0]+stats[i][0] * 2 / 100;
                newStats[i][1] = stats[i][1] * 2/100;
            }
        }
        return newStats;
    }
    public static void displayOldAndNewStats(double stats[][],double newStats[][]){
        int i;
        for (i = 0; i < 10; i++) {
            System.out.println("\nEmployee " + (i + 1) + " old salary is " + stats[i][0] + " and years of service is " + stats[i][1]);
            System.out.println("Employee " + (i + 1) + " new salary is " + newStats[i][0] + " and years of service is " + newStats[i][1]);
        }
        System.out.println("Old salary \t \t\t\t New salary \t\t Bonus amount");
        for (i = 0; i < 10; i++) {
            System.out.println(String.format("%.3f",stats[i][0]) + "\t \t \t \t  " + String.format("%.3f",newStats[i][0]) + "\t \t " + String.format("%.3f",newStats[i][0]-stats[i][0]));
        }
    }

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            double stats[][]=determineSalary();
            double newStats[][]=determineNewSalary(stats);
            displayOldAndNewStats(stats,newStats);
            int i = 0;


            input.close();
        }
    }
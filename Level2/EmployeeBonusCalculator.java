package Level2;

import java.util.Scanner;

public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] salary = new double[10];
        double[] service = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for Employee " + (i + 1));

            System.out.print("Enter salary: ");
            double s = sc.nextDouble();

            System.out.print("Enter years of service: ");
            double y = sc.nextDouble();

            if (s < 0 || y < 0) {
                System.out.println("Invalid input! Salary and years must be positive numbers.");
                i--; 
                continue;
            }

            salary[i] = s;
            service[i] = y;

            if (y > 5) {
                bonus[i] = s * 0.05; 
            } else {
                bonus[i] = s * 0.02; 
            }

            newSalary[i] = s + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += s;
            totalNewSalary += newSalary[i];
        }

        System.out.println("\nSalary and Bonus Report");
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            System.out.println("  Old Salary = " + salary[i]);
            System.out.println("  Bonus = " + bonus[i]);
            System.out.println("  New Salary = " + newSalary[i]);
            System.out.println();
        }

        System.out.println("Total Bonus Paid by Zara: " + totalBonus);
        System.out.println("Total of Old Salaries: " + totalOldSalary);
        System.out.println("Total of New Salaries: " + totalNewSalary);
    }
}

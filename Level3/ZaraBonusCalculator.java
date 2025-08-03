import java.util.Random;

public class ZaraBonusCalculator {
    public static int[][] generateEmployeeData(int n) {
        Random rand = new Random();
        int[][] data = new int[n][2];
        for (int i = 0; i < n; i++) {
            data[i][0] = 10000 + rand.nextInt(90000);
            data[i][1] = 1 + rand.nextInt(10);
        }
        return data;
    }

    public static double[][] calculateBonusAndNewSalary(int[][] data) {
        double[][] result = new double[data.length][2];
        for (int i = 0; i < data.length; i++) {
            double bonusRate = (data[i][1] > 5) ? 0.05 : 0.02;
            double bonus = data[i][0] * bonusRate;
            double newSalary = data[i][0] + bonus;
            result[i][0] = bonus;
            result[i][1] = newSalary;
        }
        return result;
    }

    public static void displayResults(int[][] oldData, double[][] newData) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

        System.out.printf("%-10s%-15s%-15s%-15s%-15s\n", "Emp ID", "Old Salary", "Service (yrs)", "Bonus", "New Salary");
        System.out.println("-------------------------------------------------------------");

        for (int i = 0; i < oldData.length; i++) {
            int salary = oldData[i][0];
            int years = oldData[i][1];
            double bonus = newData[i][0];
            double newSalary = newData[i][1];

            System.out.printf("%-10d%-15d%-15d%-15.2f%-15.2f\n", (i + 1), salary, years, bonus, newSalary);

            totalOldSalary += salary;
            totalBonus += bonus;
            totalNewSalary += newSalary;
        }

        System.out.println("-------------------------------------------------------------");
        System.out.printf("%-10s%-15.2f%-15s%-15.2f%-15.2f\n", "TOTAL", totalOldSalary, "", totalBonus, totalNewSalary);
    }

    public static void main(String[] args) {
        int[][] employeeData = generateEmployeeData(10);
        double[][] bonusData = calculateBonusAndNewSalary(employeeData);
        displayResults(employeeData, bonusData);
    }
}


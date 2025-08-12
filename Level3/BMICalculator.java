import java.util.Scanner;

public class BMICalculator {

    public static String[][] calculateBMI(double[][] hw) {
        String[][] bmiData = new String[hw.length][2];
        for (int i = 0; i < hw.length; i++) {
            double weight = hw[i][0];
            double heightCm = hw[i][1];
            double heightM = heightCm / 100.0;
            double bmi = weight / (heightM * heightM);
            String status;
            if (bmi < 18.5)
                status = "Underweight";
            else if (bmi < 25)
                status = "Normal";
            else if (bmi < 30)
                status = "Overweight";
            else
                status = "Obese";
            bmiData[i][0] = String.format("%.2f", bmi);
            bmiData[i][1] = status;
        }
        return bmiData;
    }

    public static String[][] prepareFinalData(double[][] hw) {
        String[][] bmiData = calculateBMI(hw);
        String[][] finalData = new String[hw.length][4];
        for (int i = 0; i < hw.length; i++) {
            finalData[i][0] = String.format("%.2f", hw[i][1]);
            finalData[i][1] = String.format("%.2f", hw[i][0]);
            finalData[i][2] = bmiData[i][0];
            finalData[i][3] = bmiData[i][1];
        }
        return finalData;
    }

    public static void displayTable(String[][] data) {
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Height(cm)", "Weight(kg)", "BMI", "Status");
        System.out.println("--------------------------------------------------------");
        for (String[] row : data) {
            System.out.printf("%-10s %-10s %-10s %-15s%n", row[0], row[1], row[2], row[3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] hw = new double[10][2];
        for (int i = 0; i < hw.length; i++) {
            System.out.println("Enter details for Person " + (i + 1));
            System.out.print("Weight (kg): ");
            hw[i][0] = sc.nextDouble();
            System.out.print("Height (cm): ");
            hw[i][1] = sc.nextDouble();
        }
        String[][] finalData = prepareFinalData(hw);
        displayTable(finalData);
        sc.close();
    }
}


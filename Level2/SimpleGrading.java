package Level2;

import java.util.Scanner;

public class SimpleGrading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = new int[n][3]; 
        double[] percent = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));

            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                System.out.print("Enter marks for " + subject + ": ");
                int m = sc.nextInt();

                while (m < 0 || m > 100) {
                    System.out.print("Invalid! Enter positive marks (0-100): ");
                    m = sc.nextInt();
                }

                marks[i][j] = m;
            }

            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percent[i] = total / 3.0;

            if (percent[i] >= 80) grade[i] = 'A';
            else if (percent[i] >= 70) grade[i] = 'B';
            else if (percent[i] >= 60) grade[i] = 'C';
            else if (percent[i] >= 50) grade[i] = 'D';
            else if (percent[i] >= 40) grade[i] = 'E';
            else grade[i] = 'R';
        }

        System.out.println("\n--- Results ---");
        for (int i = 0; i < n; i++) {
            System.out.printf("Student %d -> Physics: %d, Chemistry: %d, Maths: %d, Percent: %.2f%%, Grade: %c\n",
                i + 1, marks[i][0], marks[i][1], marks[i][2], percent[i], grade[i]);
        }

        sc.close();
    }
}


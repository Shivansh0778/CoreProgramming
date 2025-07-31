// package Level1;

import java.util.Scanner;

public class SimpleInterest {

    public static double calculateSI(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Rate of interest: ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time (in years): ");
        double time = sc.nextDouble();

        double interest = calculateSI(principal, rate, time);

        System.out.printf("Simple Interest = %.2f%n", interest);

        sc.close();
    }
}


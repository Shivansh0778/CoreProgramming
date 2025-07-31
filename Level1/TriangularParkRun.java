import java.util.Scanner;

public class TriangularParkRun {

    public static double calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        double totalDistance = 5000.0; 
        return totalDistance / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter side A of the triangle in meters:");
        double a = sc.nextDouble();

        System.out.println("Enter side B of the triangle in meters:");
        double b = sc.nextDouble();

        System.out.println("Enter side C of the triangle in meters:");
        double c = sc.nextDouble();

        double rounds = calculateRounds(a, b, c);
        System.out.printf("The athlete must complete %.2f rounds to cover 5 km.%n", rounds);

        sc.close();
    }
}


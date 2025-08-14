import java.util.Scanner;

public class FactorialRecursion {
    public static void main(String[] args) {
        int num = getInput();
        long fact = calculateFactorial(num);
        displayResult(num, fact);
    }

    public static int getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();
        return num;
    }

    public static long calculateFactorial(int n) {
        if (n <= 1) return 1;
        return n * calculateFactorial(n - 1);
    }

    public static void displayResult(int num, long fact) {
        System.out.println("Factorial of " + num + " is: " + fact);
    }
}

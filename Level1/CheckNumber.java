import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        int[] numbers = new int[5]; 
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println(num + " is positive and even");
                } else {
                    System.out.println(num + " is positive and odd");
                }
            } else if (num < 0) {
                System.out.println(num + " is negative");
            } else {
                System.out.println(num + " is zero");
            }
        }
        int first = numbers[0];
        int last = numbers[4];

        System.out.println("\nComparison of first and last numbers:");
        if (first == last) {
            System.out.println("First and last numbers are equal");
        } else if (first > last) {
            System.out.println("First number is greater than the last number");
        } else {
            System.out.println("First number is less than the last number");
        }
    }
}


import java.util.Scanner;

public class CountHandshake {

    public static int CountHandshake(int n) {
        return (n * (n - 1)) / 2;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Number of students cannot be negative.");
        } else {
            int handshakes = CountHandshake(n);
            System.out.println("Maximum number of handshakes possible: " + handshakes);
        }
        scanner.close();
    }
}


import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {

    public static void generateException(String text) {

        System.out.println("Character at index 100: " + text.charAt(100));
    }

    public static void handleStringIndexOutOfBounds(String text) {
        try {
            System.out.println("Character at index 100: " + text.charAt(100));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: Index is out of range!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.println("\nCalling method that throws StringIndexOutOfBoundsException:");

        System.out.println("\nCalling method with exception handling:");
        handleStringIndexOutOfBounds(input);

        scanner.close();
    }
}

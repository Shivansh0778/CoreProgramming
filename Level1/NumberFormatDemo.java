import java.util.Scanner;

public class NumberFormatDemo {

    public static void generateException(String input) {
        int number = Integer.parseInt(input);
        System.out.println("Parsed number: " + number);
    }

    public static void handleException(String input) {
        try {
            int number = Integer.parseInt(input);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: Input is not a valid integer.");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a value to convert into integer: ");
        String userInput = scanner.nextLine();

        System.out.println("\n-- Generating Exception --");
        try {
            generateException(userInput);
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e);
        }

        System.out.println("\n-- Handling Exception --");
        handleException(userInput);

        scanner.close();
    }
}


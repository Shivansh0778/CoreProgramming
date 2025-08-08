import java.util.Scanner;

public class IllegalArgumentDemo {

    public static void generateException(String text) {
        String sub = text.substring(5, 3);
        System.out.println("Substring: " + sub);
    }

    public static void handleException(String text) {
        try {
            String sub = text.substring(5, 3);
            System.out.println("Substring: " + sub);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: Start index is greater than end index.");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.println("\n-- Generating Exception --");
        try {
            generateException(input);
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e);
        }

        System.out.println("\n-- Handling Exception --");
        handleException(input);

        scanner.close();
    }
}



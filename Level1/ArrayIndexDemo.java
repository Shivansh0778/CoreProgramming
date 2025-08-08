import java.util.Scanner;

public class ArrayIndexDemo {
    public static void generateException(String[] names, int index) {
        System.out.println("Name at index " + index + ": " + names[index]);
    }

    public static void handleException(String[] names, int index) {
        try {
            System.out.println("Name at index " + index + ": " + names[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: Invalid index " + index);
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = {"Shivansh", "Rohit", "Neha", "Aman"};

        System.out.print("Enter index to access name (0 to " + (names.length - 1) + "): ");
        int index = scanner.nextInt();

        System.out.println("\n-- Generating Exception --");
        try {
            generateException(names, index);
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e);
        }

        System.out.println("\n-- Handling Exception --");
        handleException(names, index);

        scanner.close();
    }
}

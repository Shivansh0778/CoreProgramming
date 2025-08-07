import java.util.Scanner;

public class CharArrayComparison {

    public static char[] getCharsManually(String str) {
        char[] chars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        return chars;
    }

    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        char[] manualChars = getCharsManually(input);

        char[] builtinChars = input.toCharArray();

        boolean areEqual = compareCharArrays(manualChars, builtinChars);

        System.out.println("\nCharacters using manual method:");
        for (char c : manualChars) {
            System.out.print(c + " ");
        }

        System.out.println("\n\nCharacters using toCharArray():");
        for (char c : builtinChars) {
            System.out.print(c + " ");
        }

        System.out.println("\n\nAre both character arrays equal? " + areEqual);

        scanner.close();
    }
}


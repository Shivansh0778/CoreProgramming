import java.util.Scanner;

public class UpperCaseConverter {

    public static String convertToUpperManual(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);
            }
            result.append(ch);
        }
        return result.toString();
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your text: ");
        String input = scanner.nextLine();
        String builtInUpper = input.toUpperCase();
        String manualUpper = convertToUpperManual(input);
        boolean isSame = compareStrings(builtInUpper, manualUpper);
        System.out.println("\nConverted using toUpperCase(): " + builtInUpper);
        System.out.println("Converted using manual method: " + manualUpper);
        System.out.println("Are both conversions equal? " + isSame);
        scanner.close();
    }
}


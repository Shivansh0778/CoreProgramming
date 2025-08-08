import java.util.Scanner;

public class LowerCaseConverter {

    public static String convertToLowerManual(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);
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
        String builtInLower = input.toLowerCase();
        String manualLower = convertToLowerManual(input);
        boolean isSame = compareStrings(builtInLower, manualLower);
        System.out.println("\nConverted using toLowerCase(): " + builtInLower);
        System.out.println("Converted using manual method: " + manualLower);
        System.out.println("Are both conversions equal? " + isSame);
        scanner.close();
    }
}

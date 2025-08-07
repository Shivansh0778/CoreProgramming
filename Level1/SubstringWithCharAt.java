import java.util.Scanner;

public class SubstringWithCharAt {

    public static String createSubstringUsingCharAt(String str, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i < end; i++) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }

    public static boolean compareStringsUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the original string: ");
        String text = scanner.nextLine();

        System.out.print("Enter the start index: ");
        int start = scanner.nextInt();

        System.out.print("Enter the end index: ");
        int end = scanner.nextInt();

        String substringCharAt = createSubstringUsingCharAt(text, start, end);
        String substringBuiltIn = text.substring(start, end);

        System.out.println("\nSubstring using charAt(): " + substringCharAt);
        System.out.println("Substring using substring(): " + substringBuiltIn);

        boolean isEqual = compareStringsUsingCharAt(substringCharAt, substringBuiltIn);
        System.out.println("\nAre both substrings equal? " + isEqual);

        scanner.close();
    }
}


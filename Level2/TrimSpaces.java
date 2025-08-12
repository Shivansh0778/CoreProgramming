import java.util.*;

public class TrimSpaces {

    public static int[] findTrimIndexes(String text) {
        int start = 0;
        int end = getLength(text) - 1;

        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    public static String customSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    public static boolean compareStrings(String str1, String str2) {
        if (getLength(str1) != getLength(str2)) {
            return false;
        }
        for (int i = 0; i < getLength(str1); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string with leading and trailing spaces: ");
        String text = sc.nextLine();

        int[] indexes = findTrimIndexes(text);
        String customTrimmed = customSubstring(text, indexes[0], indexes[1]);
        String builtInTrimmed = text.trim();

        System.out.println("Custom Trim Result: '" + customTrimmed + "'");
        System.out.println("Built-in Trim Result: '" + builtInTrimmed + "'");
        System.out.println("Are both equal? " + compareStrings(customTrimmed, builtInTrimmed));

        sc.close();
    }
}


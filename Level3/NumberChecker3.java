import java.util.*;

public class NumberChecker3 {

    public static int countDigits(int number) {
        return Integer.toString(Math.abs(number)).length();
    }

    public static int[] getDigitsArray(int number) {
        String str = Integer.toString(Math.abs(number));
        int[] digits = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            digits[i] = str.charAt(i) - '0';
        }
        return digits;
    }

    public static int[] reverseDigitsArray(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    public static boolean isPalindrome(int number) {
        int[] digits = getDigitsArray(number);
        int[] reversed = reverseDigitsArray(digits);
        return areArraysEqual(digits, reversed);
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int[] digits = getDigitsArray(number);
        int[] reversed = reverseDigitsArray(digits);
        boolean palindrome = isPalindrome(number);
        boolean duck = isDuckNumber(digits);
        int count = countDigits(number);

        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Reversed: " + Arrays.toString(reversed));
        System.out.println("Count of digits: " + count);
        System.out.println("Is Palindrome: " + (palindrome ? "Yes" : "No"));
        System.out.println("Is Duck Number: " + (duck ? "Yes" : "No"));

        sc.close();
    }
}


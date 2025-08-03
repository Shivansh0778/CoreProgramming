import java.util.*;

public class NumberChecker {

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

    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }

    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += Math.pow(d, 2);
        return sum;
    }

    public static boolean isHarshadNumber(int number, int[] digits) {
        int sum = sumOfDigits(digits);
        if (sum == 0) return false;
        return number % sum == 0;
    }

    public static int[][] digitFrequency(int[] digits) {
        int[] freq = new int[10];
        for (int d : digits) freq[d]++;
        int size = 0;
        for (int f : freq) if (f > 0) size++;
        int[][] result = new int[size][2];
        int index = 0;
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                result[index][0] = i;
                result[index][1] = freq[i];
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int[] digits = getDigitsArray(number);
        int count = countDigits(number);
        int sum = sumOfDigits(digits);
        int squares = sumOfSquares(digits);
        boolean isHarshad = isHarshadNumber(number, digits);
        int[][] freq = digitFrequency(digits);

        System.out.println("Count of digits: " + count);
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Sum of digits: " + sum);
        System.out.println("Sum of squares: " + squares);
        System.out.println("Is Harshad Number: " + (isHarshad ? "Yes" : "No"));
        System.out.println("Digit Frequencies:");
        for (int[] row : freq) {
            System.out.println(row[0] + ": " + row[1]);
        }

        sc.close();
    }
}


import java.util.*;

public class ShortestLongestWord {

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

    public static String[] customSplit(String text) {
        int len = getLength(text);
        int wordCount = 1;

        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];
        int start = 0, index = 0;

        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                words[index++] = text.substring(start, i);
                start = i + 1;
            }
        }
        words[index] = text.substring(start);

        return words;
    }

    public static int getLength(String[] arr) {
        int count = 0;
        try {
            while (true) {
                String temp = arr[count];
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }

    public static int getLength(String[][] arr) {
        int count = 0;
        try {
            while (true) {
                String[] temp = arr[count];
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }

    public static String[][] getWordLengthTable(String[] words) {
        int rows = getLength(words);
        String[][] table = new String[rows][2];

        for (int i = 0; i < rows; i++) {
            table[i][0] = words[i];
            table[i][1] = String.valueOf(getLength(words[i]));
        }

        return table;
    }

    public static int[] findShortestLongest(String[][] table) {
        int rows = getLength(table);

        int shortest = Integer.parseInt(table[0][1]);
        int longest = Integer.parseInt(table[0][1]);

        for (int i = 1; i < rows; i++) {
            int length = Integer.parseInt(table[i][1]);
            if (length < shortest) {
                shortest = length;
            }
            if (length > longest) {
                longest = length;
            }
        }

        return new int[]{shortest, longest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = customSplit(text);

        String[][] table = getWordLengthTable(words);

        int[] result = findShortestLongest(table);

        System.out.println("\nWord\tLength");
        System.out.println("----------------");
        for (int i = 0; i < getLength(table); i++) {
            System.out.println(table[i][0] + "\t" + Integer.parseInt(table[i][1]));
        }

        System.out.println("\nShortest Word Length: " + result[0]);
        System.out.println("Longest Word Length: " + result[1]);

        sc.close();
    }
}


import java.util.Scanner;

public class WordLengthTable {

    static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {

        }
        return count;
    }

    static String[] splitWords(String text) {
        int length = getLength(text);
        String temp = "";
        int wordCount = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                if (!temp.equals("")) {
                    wordCount++;
                    temp = "";
                }
            } else {
                temp += text.charAt(i);
            }
        }
        if (!temp.equals("")) wordCount++; 

        String[] words = new String[wordCount];
        int index = 0;
        temp = "";
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                if (!temp.equals("")) {
                    words[index++] = temp;
                    temp = "";
                }
            } else {
                temp += text.charAt(i);
            }
        }
        if (!temp.equals("")) words[index] = temp;

        return words;
    }

    static String[][] getWordLengthTable(String[] words) {
        int n = words.length;
        String[][] table = new String[n][2];
        for (int i = 0; i < n; i++) {
            table[i][0] = words[i];
            table[i][1] = String.valueOf(getLength(words[i])); 
        }
        return table;
    }

    static void displayTable(String[][] table) {
        System.out.println("Word\tLength");
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t" + Integer.parseInt(table[i][1]));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String[] words = splitWords(text);

        String[][] table = getWordLengthTable(words);

        displayTable(table);

        sc.close();
    }
}

import java.util.*;

public class VowelConsonantType {

    public static String checkCharType(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }

    public static String[][] getCharTypeTable(String text) {
        int len = getLength(text);
        String[][] table = new String[len][2];
        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            table[i][0] = String.valueOf(ch);
            table[i][1] = checkCharType(ch);
        }
        return table;
    }

    public static void displayTable(String[][] table) {
        System.out.println("Character\tType");
        System.out.println("-------------------------");
        for (int i = 0; i < getLength(table); i++) {
            System.out.println(table[i][0] + "\t\t" + table[i][1]);
        }
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        String[][] table = getCharTypeTable(text);
        displayTable(table);
        sc.close();
    }
}


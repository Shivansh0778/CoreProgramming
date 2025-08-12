import java.util.Scanner;

public class CharFrequency {

    public static String[][] findFrequency(String text) {
        int[] freq = new int[256];
        int len = 0;
        try {
            while (true) {
                char ch = text.charAt(len);
                freq[ch]++;
                len++;
            }
        } catch (Exception e) {
        }
        String[][] result = new String[len][2];
        int count = 0;
        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            if (freq[ch] > 0) {
                result[count][0] = String.valueOf(ch);
                result[count][1] = String.valueOf(freq[ch]);
                freq[ch] = 0;
                count++;
            }
        }
        String[][] finalResult = new String[count][2];
        for (int i = 0; i < count; i++) {
            finalResult[i][0] = result[i][0];
            finalResult[i][1] = result[i][1];
        }
        return finalResult;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        String[][] freqData = findFrequency(text);
        System.out.println("Character\tFrequency");
        for (String[] row : freqData) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
        sc.close();
    }
}


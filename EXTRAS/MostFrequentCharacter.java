import java.util.Scanner;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take string input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        
        char mostFrequent = findMostFrequentChar(input);
        
        System.out.println("Most Frequent Character: '" + mostFrequent + "'");
        
        sc.close();
    }
    
    public static char findMostFrequentChar(String str) {
        int[] freq = new int[256]; // For ASCII characters
        int maxFreq = 0;
        char result = ' ';
        
        // Count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++;
            
            // Track the most frequent character
            if (freq[ch] > maxFreq) {
                maxFreq = freq[ch];
                result = ch;
            }
        }
        
        return result;
    }
}


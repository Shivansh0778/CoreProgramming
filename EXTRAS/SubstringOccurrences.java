import java.util.Scanner;

public class SubstringOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the main string: ");
        String mainString = sc.nextLine();

        System.out.print("Enter the substring to search: ");
        String subString = sc.nextLine();
        
        int count = countOccurrences(mainString, subString);
        
        System.out.println("The substring '" + subString + "' occurs " + count + " times.");
        
        sc.close();
    }
    
    public static int countOccurrences(String main, String sub) {
        int count = 0;

        for (int i = 0; i <= main.length() - sub.length(); i++) {
            boolean match = true;

            for (int j = 0; j < sub.length(); j++) {
                if (main.charAt(i + j) != sub.charAt(j)) {
                    match = false;
                    break;
                }
            }
            
            if (match) {
                count++;
            }
        }
        
        return count;
    }
}

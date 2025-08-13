import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        
        String result = removeDuplicates(input);
        
        System.out.println("String without duplicates: " + result);
        
        sc.close();
    }
    
    public static String removeDuplicates(String str) {
        String result = "";
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (result.indexOf(ch) == -1) {
                result += ch;
            }
        }
        
        return result;
    }
}


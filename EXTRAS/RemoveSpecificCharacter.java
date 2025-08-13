import java.util.Scanner;

public class RemoveSpecificCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        System.out.print("Enter the character to remove: ");
        char toRemove = sc.next().charAt(0);
        String result = removeCharacter(input, toRemove);
        System.out.println("Modified String: " + result);
        sc.close();
    }
    
    public static String removeCharacter(String str, char ch) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ch) {
                result += str.charAt(i);
            }
        }
        return result;
    }
}

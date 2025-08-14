import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame {
    static Random random = new Random();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int low = 1, high = 100;
        boolean correct = false;

        System.out.println("Think of a number between 1 and 100. I will try to guess it!");

        while (!correct) {
            int guess = generateGuess(low, high);
            System.out.println("My guess: " + guess);
            String feedback = getUserFeedback();
            
            if (feedback.equalsIgnoreCase("low")) {
                low = guess + 1;
            } else if (feedback.equalsIgnoreCase("high")) {
                high = guess - 1;
            } else if (feedback.equalsIgnoreCase("correct")) {
                System.out.println("Yay! I guessed your number!");
                correct = true;
            }

            if (low > high) {
                System.out.println("Hmm... Something's wrong with the feedback!");
                break;
            }
        }
    }

    public static int generateGuess(int low, int high) {
        return random.nextInt(high - low + 1) + low;
    }

    public static String getUserFeedback() {
        System.out.print("Is my guess high, low, or correct? ");
        return sc.nextLine();
    }
}

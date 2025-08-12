import java.util.*;

public class DeckOfCards {
    public static String[] initializeDeck(String[] suits, String[] ranks) {
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    public static String[] shuffleDeck(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int) (Math.random() * (n - i));
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        return deck;
    }

    public static String[][] distributeCards(String[] deck, int n, int players) {
        if (n % players != 0) {
            System.out.println("Cannot distribute cards equally.");
            return null;
        }
        int cardsPerPlayer = n / players;
        String[][] distributed = new String[players][cardsPerPlayer];
        int index = 0;
        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                distributed[i][j] = deck[index++];
            }
        }
        return distributed;
    }

    public static void printPlayersCards(String[][] playersCards) {
        for (int i = 0; i < playersCards.length; i++) {
            System.out.println("Player " + (i + 1) + ": " + Arrays.toString(playersCards[i]));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] deck = initializeDeck(suits, ranks);
        deck = shuffleDeck(deck);
        System.out.print("Enter number of cards to distribute: ");
        int n = sc.nextInt();
        System.out.print("Enter number of players: ");
        int players = sc.nextInt();
        String[][] playersCards = distributeCards(deck, n, players);
        if (playersCards != null) {
            printPlayersCards(playersCards);
        }
    }
}

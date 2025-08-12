import java.util.*;

public class RockPaperScissors {

    public static String getComputerChoice() {
        int choice = (int) (Math.random() * 3);
        if (choice == 0) return "rock";
        else if (choice == 1) return "paper";
        else return "scissors";
    }

    public static String findWinner(String user, String computer) {
        if (user.equals(computer)) return "Draw";

        if (user.equals("rock")) {
            return (computer.equals("scissors")) ? "Player" : "Computer";
        } else if (user.equals("paper")) {
            return (computer.equals("rock")) ? "Player" : "Computer";
        } else if (user.equals("scissors")) {
            return (computer.equals("paper")) ? "Player" : "Computer";
        }
        return "Invalid";
    }

    public static String[][] calculateStats(int playerWins, int computerWins, int totalGames) {
        String[][] stats = new String[2][3];

        double playerPercentage = (playerWins * 100.0) / totalGames;
        double computerPercentage = (computerWins * 100.0) / totalGames;

        stats[0][0] = "Player";
        stats[0][1] = String.valueOf(playerWins);
        stats[0][2] = String.format("%.2f%%", playerPercentage);

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] = String.format("%.2f%%", computerPercentage);

        return stats;
    }

    public static void displayResults(List<String[]> gameResults, String[][] stats) {
        System.out.println("\nGame Results:");
        System.out.printf("%-10s %-12s %-12s %-10s\n", "Game No", "Player Choice", "Computer Choice", "Winner");
        for (int i = 0; i < gameResults.size(); i++) {
            String[] res = gameResults.get(i);
            System.out.printf("%-10d %-12s %-12s %-10s\n", i + 1, res[0], res[1], res[2]);
        }

        System.out.println("\nWin Statistics:");
        System.out.printf("%-10s %-10s %-10s\n", "Name", "Wins", "Win %");
        for (String[] row : stats) {
            System.out.printf("%-10s %-10s %-10s\n", row[0], row[1], row[2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int totalGames = sc.nextInt();
        sc.nextLine();

        List<String[]> gameResults = new ArrayList<>();
        int playerWins = 0, computerWins = 0;

        for (int i = 0; i < totalGames; i++) {
            System.out.print("Enter your choice (rock/paper/scissors): ");
            String playerChoice = sc.nextLine().toLowerCase();
            String computerChoice = getComputerChoice();
            String winner = findWinner(playerChoice, computerChoice);

            if (winner.equals("Player")) playerWins++;
            else if (winner.equals("Computer")) computerWins++;

            gameResults.add(new String[]{playerChoice, computerChoice, winner});
        }

        String[][] stats = calculateStats(playerWins, computerWins, totalGames);
        displayResults(gameResults, stats);
        sc.close();
    }
}


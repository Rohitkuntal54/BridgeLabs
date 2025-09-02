import java.util.Scanner;

public class ques_9 {

    // Method to get computer's choice randomly (0-rock, 1-paper, 2-scissors)
    public static String getComputerChoice() {
        int choice = (int) (Math.random() * 3);
        switch (choice) {
            case 0: return "rock";
            case 1: return "paper";
            default: return "scissors";
        }
    }

    // Method to find winner: returns "user", "computer" or "draw"
    public static String findWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return "draw";
        }

        if (userChoice.equals("rock")) {
            return (computerChoice.equals("scissors")) ? "user" : "computer";
        } else if (userChoice.equals("paper")) {
            return (computerChoice.equals("rock")) ? "user" : "computer";
        } else { // userChoice == scissors
            return (computerChoice.equals("paper")) ? "user" : "computer";
        }
    }

    // Method to calculate stats: returns a 2D String array with win counts and percentages
    public static String[][] calculateStats(int userWins, int computerWins, int draws, int totalGames) {
        String[][] stats = new String[4][2];
        stats[0][0] = "User Wins";
        stats[0][1] = String.valueOf(userWins);

        stats[1][0] = "Computer Wins";
        stats[1][1] = String.valueOf(computerWins);

        stats[2][0] = "Draws";
        stats[2][1] = String.valueOf(draws);

        stats[3][0] = "Winning Percentages (User / Computer)";
        double userPercent = totalGames == 0 ? 0 : (userWins * 100.0) / totalGames;
        double compPercent = totalGames == 0 ? 0 : (computerWins * 100.0) / totalGames;
        stats[3][1] = String.format("%.2f%% / %.2f%%", userPercent, compPercent);

        return stats;
    }

    // Method to display results table for all games and stats
    public static void displayResults(String[] userChoices, String[] computerChoices, String[] winners, String[][] stats) {
        System.out.printf("%-10s | %-14s | %-10s\n", "Game No.", "User Choice", "Winner");
        System.out.println("---------------------------------------");
        for (int i = 0; i < userChoices.length; i++) {
            System.out.printf("%-10d | %-14s | %-10s\n", i + 1, userChoices[i], winners[i]);
        }
        System.out.println("\nStats:");
        for (String[] row : stats) {
            System.out.printf("%-30s : %s\n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of games to play: ");
        int n = scanner.nextInt();
        scanner.nextLine();  // consume newline

        String[] userChoices = new String[n];
        String[] computerChoices = new String[n];
        String[] winners = new String[n];

        int userWins = 0;
        int computerWins = 0;
        int draws = 0;

        for (int i = 0; i < n; i++) {
            String userChoice = "";
            while (true) {
                System.out.print("Game " + (i + 1) + " - Enter your choice (rock/paper/scissors): ");
                userChoice = scanner.nextLine().toLowerCase();
                if (userChoice.equals("rock") || userChoice.equals("paper") || userChoice.equals("scissors")) {
                    break;
                }
                System.out.println("Invalid input! Please enter rock, paper, or scissors.");
            }

            String compChoice = getComputerChoice();
            String winner = findWinner(userChoice, compChoice);

            userChoices[i] = userChoice;
            computerChoices[i] = compChoice;
            winners[i] = winner;

            if (winner.equals("user")) userWins++;
            else if (winner.equals("computer")) computerWins++;
            else draws++;
        }

        String[][] stats = calculateStats(userWins, computerWins, draws, n);
        displayResults(userChoices, computerChoices, winners, stats);

        scanner.close();
    }
}


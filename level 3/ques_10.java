import java.util.Scanner;

public class ques_10 {

    // Suits and ranks arrays
    static String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    static String[] ranks = {
        "2", "3", "4", "5", "6", "7", "8", "9", "10",
        "Jack", "Queen", "King", "Ace"
    };

    // Initialize the deck
    public static String[] initializeDeck() {
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

    // Shuffle the deck
    public static String[] shuffleDeck(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int)(Math.random() * (n - i));
            // Swap deck[i] with deck[randomCardNumber]
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        return deck;
    }

    // Distribute n cards to x players, return a 2D array
    public static String[][] distributeCards(String[] deck, int n, int x) {
        if (n > deck.length) {
            System.out.println("Error: Requested cards more than deck size.");
            return null;
        }
        if (n % x != 0) {
            System.out.println("Error: Cannot evenly distribute " + n + " cards among " + x + " players.");
            return null;
        }
        int cardsPerPlayer = n / x;
        String[][] players = new String[x][cardsPerPlayer];

        int cardIndex = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                players[i][j] = deck[cardIndex++];
            }
        }
        return players;
    }

    // Print players and their cards
    public static void printPlayersCards(String[][] players) {
        if (players == null) {
            System.out.println("No players' cards to display.");
            return;
        }
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + "'s cards:");
            for (String card : players[i]) {
                System.out.println("  " + card);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize and shuffle deck
        String[] deck = initializeDeck();
        deck = shuffleDeck(deck);

        System.out.print("Enter number of cards to distribute (n): ");
        int n = scanner.nextInt();

        System.out.print("Enter number of players (x): ");
        int x = scanner.nextInt();

        String[][] players = distributeCards(deck, n, x);

        printPlayersCards(players);

        scanner.close();
    }
}


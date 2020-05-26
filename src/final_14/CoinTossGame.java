package final_14;
/*
third class will be one called CoinTossGame — which creates two players.
It asks player 1 to choose heads or tails, and ensures that player 1’s guess is valid.
Don't move on until player 1 actually has a valid guess.
Then, automatically assign player 2’s guess to the opposite of what player 1 chose.
You're going to flip the coin in this class to determine which side it landed on.
Then you're going to determine a winner based on what the coin landed on.
Also, be sure to use methods appropriately in this class.
 */

import java.util.Scanner;

public class CoinTossGame {
    private static Scanner scanner = new Scanner(System.in);
    private static boolean isValid = false;
    private static String player1Name;
    private static String player2Name;
    private static String player1guess;
    private static String player2guess;

    public static void main(String[] args) {
        Player player1 = new Player(askName1());
        Player player2 = new Player(askName2());

        do {
            askGuess(player1);
        } while (!isValid);

        assignGuess(player2);

        Coin coin = new Coin();
        coin.flip();

        determineWinner(player1guess, coin);
        scanner.close( );

    }

    public static String askName1(){
        System.out.println("Please enter player's 1 name: " );
        player1Name = scanner.next( );
        return player1Name;
    }

    public static String askName2(){
        System.out.println("Please enter player's 2 name: " );
        player2Name = scanner.next();
        return player2Name;
    }

    public static String askGuess(Player player1) {
        System.out.println(player1.getName() + " Please enter Heads or Tails: ");
        player1guess = scanner.next();
        if (player1guess.equalsIgnoreCase(Coin.HEADS) || player1guess.equalsIgnoreCase(Coin.TAILS)) {
            isValid = true;
        } else {
            System.out.println("Invalid option. Try again.");
        }
        player1.setGuess(player1guess);
        return player1.getGuess();
    }

    public static String assignGuess(Player player2) {
        if (player1guess.equalsIgnoreCase(Coin.HEADS)) {
            player2guess = "Tails";
        } else {
            player2guess = "Heads";
        }
        player2.setGuess(player2guess);
        return player2.getGuess();
    }

    public static void determineWinner(String player1guess, Coin side) {
        String coinSide = side.getSide();

        if (player1guess.equalsIgnoreCase(coinSide)) {
            System.out.println("The coin landed on " + coinSide + ". The winner is " + player1Name);
        } else {
            System.out.println("The coin landed on " + coinSide + ". The winner is " + player2Name);
        }

    }

}

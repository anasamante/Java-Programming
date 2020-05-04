package loops_4;

import java.util.Random;

/*
 * The objective of this game is to travel the entire game board of 20 spaces within 5 die rolls.
 * Roll the die for the user (generate a Random number between 1 – 6) and advance the user that number of spaces on the game board. Here’s the code to do this ((import is java.util.Random):
 * Random random = new Random();
 * int die = random.nextInt(6) + 1;
 * After each roll, tell the user which game space they are on and how many more spaces they have to go to win.
 * Repeat this 4 additional times, for 5 rolls in total.
 * However, if the user gets to 20 before 5 rolls, end the game - they’ve won.
 * If they are greater than or less than 20 spaces exactly, they lose.
 * Remember there are only 20 spaces on the board, so a message like “You advanced to space 22” is a bug.
 */

public class RollTheDie {
    public static void main(String[] args) {
        int totalSpaces = 20;
        int totalDieRolls = 5;
        int currentSpaceNbr = 0;
        Random random = new Random();

        for(int i = 0; i < totalDieRolls; i++){
            int die = random.nextInt(6) + 1;
            currentSpaceNbr =  currentSpaceNbr + die;
            int remainingSpaces = totalSpaces - currentSpaceNbr;

            if(currentSpaceNbr < totalSpaces && (i+1)== totalDieRolls){
                System.out.println("Roll # " + (i+1) + ": You've rolled a " + die + ". You are now on space "
                        + currentSpaceNbr + ". You loose.");
            }
            else if (currentSpaceNbr > totalSpaces){
                System.out.println("Roll # " + (i+1) + ": You've rolled a " + die + ". You went over the 20 spaces. You loose.");
                break;
            }
            else if(currentSpaceNbr == totalSpaces) {
                System.out.println("Roll # " + (i + 1) + ": You've rolled a " + die +
                        ". You are now on space " + currentSpaceNbr + " you've won.");
                break;
            }
            else {
                System.out.println("Roll # " + (i + 1) + ": You've rolled a " + die + ". You are now on space "
                        + currentSpaceNbr + " and have " + (remainingSpaces) + " more to go.");
            }
        }
    }
}
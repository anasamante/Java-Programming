import java.util.Random;

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
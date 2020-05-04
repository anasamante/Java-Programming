package arrays_7;

import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {
    //set the length of the array to have 6 spaces, is a constant
    private static final int LENGTH = 6;
    //set the maximun number allowed
    private static final int MAX_NUMBER = 69;

    public static void main(String[] args) {
        int[] lottoTicket = generateNumbers();
        Arrays.sort(lottoTicket);
        printTicket(lottoTicket);
    }

    //generate 6 random numbers for the ticket
    public static int[] generateNumbers() {
        int[] lottoTicket = new int[LENGTH];
        Random random = new Random();

        for (int i = 0; i < LENGTH; i++) {
            int randomNumber;

            //searchDuplicates the Random Number in the array to check for duplicates
            do {
                randomNumber = random.nextInt(MAX_NUMBER) + 1;
            } while (searchDuplicates(lottoTicket, randomNumber));

            // when number is unique is added to the array in the i index
            lottoTicket[i] = randomNumber;
        }

        return lottoTicket;
    }

    /**
     * method that searches the generated random number against the array,
     * to prevent duplicate numbers
     *
     * @param lottoTicket  array
     * @param randomNumber random number to be unique
     * @return
     */
    public static boolean searchDuplicates(int[] lottoTicket, int randomNumber) {
        for (int value : lottoTicket) {
            if (value == randomNumber) {
                return true;
            }

        }
        return false;
    }

    //example of a binary search - array needs to be sorted by asc
    public static boolean binarySearchDuplicates(int[] lottoTicket, int randomNumber) {
        Arrays.sort(lottoTicket);
        // the binary search will return an index position where the number was found
        int index = Arrays.binarySearch(lottoTicket, randomNumber);
        if (index >= 0) {
            return true;
        }
        else return false;
    }

    //print the ticket values
    public static void printTicket(int lottoTicket[]) {
        for (int i = 0; i < LENGTH; i++) {
            System.out.print(lottoTicket[i] + " | ");
        }
    }
}


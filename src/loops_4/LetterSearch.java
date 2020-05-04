package loops_4;

import java.util.Scanner;

public class LetterSearch {

    /*
     * LOOP BREAK
     * Search a String to determine if it contains the letter 'A'.
     */
    public static void main(String[] args) {
        // get text
        System.out.println("Enter text:");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        scanner.close();

        boolean letterFound = false;

        // searchDuplicates text for A;

        for (int i = 0; i<text.length(); i++){
            char currentLetter = text.charAt(i);
            if(currentLetter == 'A' || currentLetter == 'a'){
                letterFound = true;
                break;
            }
        }

        if(letterFound){
            System.out.println("The text contains the letter 'A'");

        }else {
            System.out.println("The text does not contain the letter 'A'");
        }

    }
}

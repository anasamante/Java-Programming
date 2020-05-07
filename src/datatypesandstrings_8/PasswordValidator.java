package datatypesandstrings_8;

/*
You'll need to verify the strength of a proposed password change.
The password must be at least eight characters long,
contain an uppercase letter,
contain a special character,
not contain the username and
not be the same as the old password.
 */

import java.util.Scanner;

public class PasswordValidator {
    private static Scanner scanner = new Scanner(System.in);

    private static final int PASSWORD_LENGTH = 8;

    public static boolean length = false;
    public static boolean uppercase = false;
    public static boolean specialChar = false;
    public static boolean containUser = false;
    public static boolean samePass = false;

    public static void main(String[] args) {

        String userName = "Ana Amante";
        String oldPass = "Testing1!";
        String newPass = "kjggHH#Hu";

        validatePass(userName, oldPass, newPass);

        printMessage();

        scanner.close();

    }

     public static void validatePass(String userName, String oldPass, String newPass){
        if(newPass.length() >= PASSWORD_LENGTH){
            length = true;
        }
        for (int i = 0; i <newPass.length(); i++) {
            if(Character.isUpperCase(newPass.charAt(i))){
                uppercase = true;
            }
            if (!(Character.isAlphabetic(newPass.charAt(i)) || Character.isDigit(newPass.charAt(i)) ||
                    Character.isSpaceChar(newPass.charAt(i)))){
                specialChar = true;
            }
        }
        if (newPass.contains(userName)){
            containUser = true;
        }
        if (oldPass.equalsIgnoreCase(newPass)) {
            samePass = true;
        }

    }

    public static void printMessage(){
        if (!length){
            System.out.println("Invalid length");
        }
        else if (!uppercase){
            System.out.println("No uppercase");
        }
        else if (!specialChar){
            System.out.println("No special char");
        }
        else if (containUser){
            System.out.println("The user name is in your password");
        }
        else if (samePass){
            System.out.println("New password is the same as old one.");
        }
        else{
            System.out.println("Valid Pass");
        }
    }

}

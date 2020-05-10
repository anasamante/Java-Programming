package datatypesandstrings_8;

import java.util.Scanner;

/*
You'll need to verify the strength of a proposed password change.
The password must be at least eight characters long,
contain an uppercase letter,
contain a special character,
not contain the username and
not be the same as the old password.
 */

public class PasswordValidator {

    private static Scanner scanner = new Scanner(System.in);

    private static final int PASSWORD_LENGTH = 8;

    private String userName;
    private String oldPass;

    private static String newPass;
    private static boolean isNewPassValid;

    public PasswordValidator(String userName, String oldPass) {
        this.userName = userName;
        this.oldPass = oldPass;
    }

    public static void main(String[] args) {

        var validator = askUserAndPass();

        do {
            askNewPass();
            validatePass(validator.userName, validator.oldPass, newPass);
        } while (!isValid(isNewPassValid));

        scanner.close();

    }

    public static PasswordValidator askUserAndPass() {
        System.out.println("Please enter username: ");
        String userName = scanner.nextLine();

        System.out.println("Please enter old pass: ");
        String oldPass = scanner.nextLine();

        return new PasswordValidator(userName, oldPass);
    }

    public static String askNewPass() {
        System.out.println("Please enter new pass: ");
        newPass = scanner.nextLine();
        return newPass;
    }

    public static boolean validatePass(String userName, String oldPass, String newPass) {
        isNewPassValid = false;
        if (newPass.length() < PASSWORD_LENGTH) {
            System.out.println("The password must have at least 8 characters");
        } else if (newPass.equals(newPass.toLowerCase())) {
            System.out.println("The password must have at least one uppercase letter");
        } else if (newPass.matches("[A-Za-z0-9 ]*")) {
            System.out.println("The password must have at least one special character");
        } else if (newPass.contains(userName)) {
            System.out.println("The password can't have the username");
        } else if (newPass.equalsIgnoreCase(oldPass)) {
            System.out.println("The password can't be the same as the old one ");
        } else isNewPassValid = true;
        return isNewPassValid;
    }

    public static boolean isValid(boolean isValid) {
        if (isValid) {
            System.out.println("Correct Password");
        }
        return isValid;
    }
}

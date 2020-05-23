package exceptions_13;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

/* write a program that reads decimal numbers from a file.
And then we're going to handle two types of exceptions that come from that program —
the FileNotFoundException and InputMismatchException.
 */
public class NumbersExceptionHandling {
    public static void main(String[] args) {
        numbersExceptionHandling();

    }

    public static void numbersExceptionHandling() {
        File file = new File("resources/numbers.txt");//set the path to the file
        try (Scanner fileReader = new Scanner(file)){//we are reading the file - exception file not found -
            // added Scanner as a resource so JAva will automatically close it

            while (fileReader.hasNext()) {//read every line from the file
                double num = fileReader.nextDouble();// if one of the lines is not double we would get an InputMismatchException.
                System.out.println(num);//print the number
            }
        } catch (FileNotFoundException | InputMismatchException e ) { // add all exceptions possible in one block
            e.printStackTrace();
        }

    }


}

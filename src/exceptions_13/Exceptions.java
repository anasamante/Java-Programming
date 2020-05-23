package exceptions_13;

import java.io.File;
import java.io.IOException;
//All exceptions inherit from the Exception class.
public class Exceptions {
    public static void main(String[] args) {
        createNewFile();
    }

    //Create a new file in a non existent directory
    public static void  createNewFile(){
        File file = new File("resources/doesntexist.txt");
        try {file.createNewFile();//the filepath doesn't exists so it will throw an exception
        }catch (IOException e){// catches the exception and prints a message and its stack trace
            System.out.println("Path doesn't exist.");
            e.printStackTrace();
        }
    }
}

package datatypesandstrings_8;
/*
create a method that counts the number of words in a String and prints them individually on a new line.
 */
public class TextProcessor {

    public static void main(String[] args) {
        countWords("I love Test Automation University");

    }

    public static void countWords(String text){
        var words = text.split(" ");

    }
}

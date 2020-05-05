package datatypesandstrings_8;

/*
create a method that counts the number of words in a String and prints them individually on a new line.
 */
public class TextProcessor {

    static int numberOfWords;

    public static void main(String[] args) {
        countTheWords("This is the sentence to count the numbers of words from.");
    }

    public static void countTheWords(String phrase) {
        var words = phrase.split(" ");
        numberOfWords = words.length;

        System.out.println(String.format("Your phrase contains %d words: ", numberOfWords));
        
        for (int i = 0; i < numberOfWords; i++) {
            System.out.println(words[i]);
        }

    }


}

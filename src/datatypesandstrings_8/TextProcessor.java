package datatypesandstrings_8;

public class TextProcessor {

    static int numberOfWords;

    public static void main(String[] args) {
        countTheWords("This is the sentence to count the numbers of words from.");
        reverseString("Reverse");
        addSpaces("ThisIsAJumbledPhrase");
    }

    /**
     * method that cuts the phrase by the spaces it has, returns an array and count the words
     * then, it prints them in different lines
     *
     * @param phrase the phrase to be splitted
     */
    public static void countTheWords(String phrase) {
        var words = phrase.split(" ");
        numberOfWords = words.length;

        System.out.println(String.format("Your phrase contains %d words: ", numberOfWords));

        for (int i = 0; i < numberOfWords; i++) {
            System.out.println(words[i]);
        }

    }

    /**
     * method that prints a given String backwards
     *
     * @param word the string to reverse
     */
    public static void reverseString(String word) {
        System.out.println("Here is the reversed word: ");
        for (int i = word.length() - 1; i >= 0; i--) {
            System.out.print(word.charAt(i));

        }

    }

    /**
     * Add spaces before every uppercase letter
     *
     * @param word jumbled text
     */
    public static void addSpaces(String word) {
        var modifiedText = new StringBuilder(word);
        for (int i = 0; i < modifiedText.length(); i++) {
            if (i != 0 && Character.isUpperCase(modifiedText.charAt(i))) {
                modifiedText.insert(i, " ");
                i++;
            }
        }
        System.out.println(modifiedText);
    }
}

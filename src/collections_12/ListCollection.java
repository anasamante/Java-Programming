package collections_12;

import java.util.ArrayList;
import java.util.List;

public class ListCollection {
    public static void main(String[] args) {
        // list collection - ordered elements, can eb accessed thorough its index, can contain duplicates
        List fruit = new ArrayList();

        fruit.add("lemon");
        fruit.add("orange");
        fruit.add("apple");
        fruit.add("lemon");

        System.out.println(fruit.get(2));// returns apple
        System.out.println(fruit.size());// get size as arrays
        System.out.println(fruit);// returns the list in order

    }
}

package collections_12;

import java.util.LinkedList;
import java.util.Queue;

public class QueueCollection {
    public static void main(String[] args) {
        // Queue collection, holds elemtens to be processed, are ordered, can contain duplicates
        // follows FIFO.
        Queue fruit = new LinkedList();
        fruit.add("lemon");
        fruit.add("orange");
        fruit.add("apple");
        fruit.add("lemon");

        System.out.println(fruit.size());// get size as arrays
        System.out.println(fruit);

        fruit.remove();// it will remove the first element - head (removed lemon)

        System.out.println(fruit);

        System.out.println(fruit.peek());// returns the head of the collection
    }

}

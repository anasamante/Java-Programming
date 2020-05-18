package collections_12;

import java.util.HashSet;
import java.util.Set;

public class SetCollection {
    public static void main(String[] args) {
        // Set collection -  can't have duplicates - can hold any type of objects
        //declared a String to use the enhanced loop
        Set<String> fruit = new HashSet();
        fruit.add("lemon");
        fruit.add("orange");
        fruit.add("apple");
        fruit.add("lemon");// wont throw an error but will not be added since it's duplicated

        System.out.println(fruit.size());
        System.out.println(fruit);// will return the list unordered

        /*
        Iterator for Set collection, it's an unordered list, cant loop through indexes as an array
         */

        var i = fruit.iterator();
        while (i.hasNext()) // checks that the i item is not the last one on the collection
            System.out.println(i.next());

        /*
        Enhanced for loop
         */

        // every item in this set its a set
        for (String item : fruit) {
            System.out.println(item);
        }

        /*
        for each, will take a lambda expression.
         */
        // set x to the item i'm on, then you give an action (->)

        fruit.forEach(x -> System.out.println(x) );
        //Instead of declaring this variable and using the arrow, you can just use a System.out
        // and then put double colon and the method that you want to use.
        fruit.forEach(System.out::println);
    }

}

package collections_12;

import java.util.HashMap;
import java.util.Map;

public class MapCollection {
    public static void main(String[] args) {
        // map interface - can access elements by its key, that need to be unique, not its values
        //fruit name as key and calories as values
        //specify the specific type to use the enhanced loop
        Map<String, Integer> fruitCalories = new HashMap();

        //dont have the add method, has the put method, takes the key and value, any object type can be used

        fruitCalories.put("apple", 54);
        fruitCalories.put("orange", 253);
        fruitCalories.put("banana", 323);
        fruitCalories.put("pear", 554);
        fruitCalories.put("apple", 222);// is not an unique key

        System.out.println(fruitCalories.size());// we attempted to add a duplicate value so will return 4 ( apple updated it value)
        System.out.println(fruitCalories);

        System.out.println(fruitCalories.get("banana"));
        System.out.println(fruitCalories.entrySet());// returns a Set collection

        fruitCalories.remove("orange");// removes the orange key
        System.out.println(fruitCalories);

        /*
        To iterate over the Map we can use entrySet — that returns Set object, and then print the value from the set.
         */

        for (var entry : fruitCalories.entrySet()) {
            System.out.println(entry.getValue());// needed to specify the data type 
        }
        /*
        for each 
         */
        fruitCalories.forEach((k, v) -> System.out.println("Fruit: " + k + " Calories: " + v));

    }

}


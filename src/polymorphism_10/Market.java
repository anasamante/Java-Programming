package polymorphism_10;

public class Market {
    public static void main(String[] args) {
        // an object Fruit instantiating an Apple class, can access the make juice method overriding in Apple.
        // Can't access the Apple method removeSeeds
        Fruit apple = new Apple();
        apple.makeJuice();
        // the Fruit object type apple, can access the removeSeeds() method by casting to Apple object type
        ((Apple)apple).removeSeeds();


        Fruit banana = new Banana();
        banana.makeJuice();

        Banana banana1 = new Banana();
        banana1.peel();

        Fruit orange = new Fruit();

        squeeze(apple);
        squeeze(banana);
        squeeze(banana1);
        squeeze(orange);

    }

    public static void squeeze(Fruit fruit){
        System.out.print("Squeezing...");
        fruit.makeJuice();
    }
}

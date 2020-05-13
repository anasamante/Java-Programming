package abstractionandinterface_11;

public class Farm {
    public static void main(String[] args) {
        Animal pig = new Pig();
        pig.eat();
        pig.makeSound();

        Animal duck = new Duck();
        duck.eat();
        duck.makeSound();

        Duck duck1 = new Duck();
        duck1.makeSound();
        duck1.eat();

        Pig pig1 = new Pig();
        pig1.makeSound();
        pig1.eat();
    }
}

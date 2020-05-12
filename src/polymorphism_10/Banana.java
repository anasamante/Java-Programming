package polymorphism_10;

public class Banana extends Fruit {


    public Banana() {
        setCalories(120);
    }

    public void peel() {
        System.out.println("Please peel the banana");
    }

    @Override
    public void makeJuice() {
        System.out.println("Banana Juice is made");
    }





}

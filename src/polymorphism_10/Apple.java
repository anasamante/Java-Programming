package polymorphism_10;

public class Apple extends Fruit {

    public Apple() {
        setCalories(45);

    }

    public void removeSeeds(){
        System.out.println("Please remove seeds");
    }

    @Override
    public void makeJuice() {
        System.out.println("Apple Juice is made");
    }
}

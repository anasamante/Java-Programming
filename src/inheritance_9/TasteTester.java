package inheritance_9;

public class TasteTester {
    public static void main(String[] args) {
        Cake cake = new Cake();

        cake.setFlavor("chocolate");
        cake.setPrice(10.45);

        System.out.println("The " + cake.getFlavor() + " cake is " + cake.getPrice() + " dollars.");

        BirthdayCake bDayCake = new BirthdayCake();
        bDayCake.setFlavor("vanilla");
        bDayCake.setCandles(20);

        System.out.println("The " + bDayCake.getFlavor() + " birthday cake with " + bDayCake.getCandles() + " candles is also "
                + cake.getPrice() + " dollars.");

        WeddingCake weddingCake = new WeddingCake();
        weddingCake.setPrice(50);
        weddingCake.setTiers(3);

        System.out.println("The " + cake.getFlavor() + " wedding cake that has " + weddingCake.getTiers() + " tiers is "
                + weddingCake.getPrice() + " dollars.");
    }



}

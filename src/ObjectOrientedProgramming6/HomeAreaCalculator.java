package ObjectOrientedProgramming6;

public class HomeAreaCalculator {
    /**
     * Write a class that creates instances of the `Rectangle` class to find the
     * total area of two rooms in a house
     */

    public static void main(String[] args) {

        double room1Area;
        double room2Area;
        double totalArea;


        //first room
        Rectangle room1 = new Rectangle();

        room1.setWidth(20);
        room1.setLenght(10.5);
        room1Area = room1.area();

        //second room
        Rectangle room2 = new Rectangle(20,10.5);
        room2Area = room2.area();

        totalArea = room1Area + room2Area;

        System.out.println("The area of both rooms is " + totalArea);

    }
}

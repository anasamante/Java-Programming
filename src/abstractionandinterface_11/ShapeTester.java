package abstractionandinterface_11;

public class ShapeTester {
    public static void main(String[] args) {
        // this isn't possible, shape is abstract cannot be instantiated
        //Shape rectangle = new Shape();
        // we can instantiate it subclass where the abstract method is overriding
        Shape rectangle = new Rectangle(5,25);
        //print form the shape abstract
        rectangle.print();
        //calculate from the overridden method in Rectangle class
        System.out.println(rectangle.calculateArea());
    }
}

package abstractionandinterface_11;
// interface keyword
public interface Product {
    // methods without body as an abstract class
    // there are no fields set in an interface because they should be set as final and a value assigned
    double getPrice();
    void setPrice(double price);

    String getName();
    void setName(String name);

    String getColor();
    void setColor(String color);

    // Java 8 introduced a new option, where I can declare methods as default within interfaces.
    // If you declare the method as default you can provide a default implementation for this method.

    default String getBarcode(){
        return "no barcode";
    }
}

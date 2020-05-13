package abstractionandinterface_11;

public class Customer {
    public static void main(String[] args) {
        //I cant instantiate the Product interface
        Product book = new Book();
        // I get all the methods available to use
        book.setPrice(9.99);

    }
}

package inheritance_9;

public class InheritanceTestRectangleSquare {

    public static void main(String[] args) {

        //superclass - one method print available
        Rectangle rectangle = new Rectangle();
        rectangle.print();

        //subclass - 2 methods print available, one takes a string (overloaded method)
        Square square = new Square();
        square.print(" square");
        square.print();
    }


}

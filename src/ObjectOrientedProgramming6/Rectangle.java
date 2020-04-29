package ObjectOrientedProgramming6;
/**
 * write a class that describes the fields and methods of a rectangle.
 */
public class Rectangle {

    private double lenght;
    private double width;

    // default constructor
    public Rectangle() {
        lenght = 0;
        width = 0;
    }

    //Constructor with parameters
    public Rectangle(double lenght, double width) {
        setLenght(lenght);
        setWidth(width);
    }

    // getters and setters for the fields
    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    //methods without parameters
    public double perimeter(){
        return (2 * lenght) + (2 * width);
    }

    public double area(){
        return lenght * width;
    }

}

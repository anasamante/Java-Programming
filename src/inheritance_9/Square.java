package inheritance_9;
//classes can only directly inherit from one superclass.
// a superclass can also inherit from another class, thus forming a chain of inheritance
public class Square extends Rectangle {
    //overriding method, copy the same method with the same signature but change the body
    @Override //let you know that the method is being intentionally overriding a method
    // this cannot be set to be stricter than public, because it is public on the superclass
    public double calculatePerimeter(){
        //sides and lenght are in the superclass not declared here
        // the fields are protected so they can be accessed,
        // if the fields are private they cannot be accessed
        return sides * length;
    }
    // I am overloading the print method form the superclass,
    // that method doesnt take a String
    public void print(String what){
        System.out.println("I'm a" + what);
    }
}

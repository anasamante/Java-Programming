package abstractionandinterface_11;
// is not designed to be instantiated. It's designed to be extended, making the subclass owner of the implementation
//cannot be instantiated,
public abstract class Shape {
    //An abstract method has no body,
    // only the signature of the method is defined, and it is not designed to be run as is.
    // It's designed to be overridden by a subclass.
    //This is meant to be a template to set a standard that any subclass of Shape should provide behavior for this method.
    //we have an abstract method in this class, we are required to make the class itself abstract as well.
    abstract double calculateArea();

    //An abstract class doesn't only have to contain abstract methods.

    public void print(){
        System.out.println("I am a shape");
    }
}

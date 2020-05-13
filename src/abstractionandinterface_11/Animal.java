package abstractionandinterface_11;
/*create an abstract class called Animal, which declares an abstract method called makeSound(),
and implements a non-abstract method called eat().

Then create a Pig class and a Duck class that both extend the Animal class.

Finally, create a Farm class to test these implementations.
 */
public abstract class Animal {
    abstract void makeSound();

    public void eat(){
        System.out.println("I am eating");
    }

}

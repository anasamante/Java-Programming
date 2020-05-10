package inheritance_9;

public class InheritanceTestEmployeePerson {

    public static void main(String[] args) {
        //after creating a new instance for both clasess I can access their methods
        //Person person = new Person();
        Employee employee = new Employee();
        // employee doesn't have the getAge() method but I can access it
        // through employee because it is inheriting from person class
        //person.getAge();
        //employee.getAge();

        // having set a default constructor to the superclass and subclass,
        // the first executed constructor is the superclass one. Then the subclass


    }
}

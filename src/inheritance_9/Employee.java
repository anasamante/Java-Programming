package inheritance_9;
// This is a subclass, is inheriting from superclass Person

public class Employee extends Person {

    private String employeeId;
    private String title;

    /* If I want to access a non default constructor from the superclass I need to do super(parameter)
    public Employee() {
        super("Ana");
        System.out.println("Accessed the subclass constructor");
    }*/

    // The call to the superclass constructor that is not the default one, must be the first statement in the
    //subclass constructor, otherwise theres an error
    /*public Employee() {
        System.out.println("Accessed the subclass constructor");
        super("Ana");

    }*/

    //if there is no default constructor in the superclass, the constructor in the subclass
    // must explicitly call a constructor. otherwise there is an error "There is no default constructor available"

    public Employee() {

    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}



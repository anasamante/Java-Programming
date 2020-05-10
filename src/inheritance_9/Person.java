package inheritance_9;

public class Person {

    private String name;
    private int age;
    private String gender;

    //defult superclass constructor
    public Person() {
        System.out.println("Accessed the superclass default constructor");
    }

    public Person(String name) {
        System.out.println("Accessed the superclass constructor that takes the name");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}

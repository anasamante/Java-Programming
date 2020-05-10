package inheritance_9;

public class InheritanceWomanMother {
    public static void main(String[] args) {
        Mother mother = new Mother();
        // we can access Person class methods, mother extends from woman that extends from person
        // setName is from person class
        mother.setName("Glenda");
        // getGender is taking the gender set on woman's class

        System.out.println(mother.getName() + " is a " + mother.getGender());
    }
}

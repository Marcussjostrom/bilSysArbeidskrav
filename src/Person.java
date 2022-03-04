
public class Person {

    int id;
    String name;
    int birthYear;
    static int nextId = 1;

    public Person(String name, int birthYear) {
        this.id = nextId++;
        this.name = name;
        this.birthYear = birthYear;
    }

    public Person() {
        id = nextId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void display() {
        System.out.println("Person");
        System.out.println("\t" + "ID: " + getId());
        System.out.println("\t" + "Navn: " + getName());
        System.out.println("\t" + "Fødelsesdato: " + getBirthYear());
        System.out.println("\t" + "Bil: ");
    }

}

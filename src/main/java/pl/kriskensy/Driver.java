package pl.kriskensy;

public class Driver implements Vehicle {
    private String pesel;
    protected String surname;
    public String name;
    public int age;

    public Driver(String pesel, String surname, String name, int age) {
        this.pesel = pesel;
        this.surname = surname;
        this.name = name;
        this.age = age;
    }

    public void printInformation() {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Age: " + age);
        System.out.println("PESEL: " + pesel);
    }
}
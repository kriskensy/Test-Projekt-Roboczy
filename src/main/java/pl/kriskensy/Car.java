package pl.kriskensy;

public class Car implements Vehicle {
    private String vin;
    protected int yearOfProduction;
    public String brand;
    public String model;

    public Car(String vin, int yearOfProduction, String brand, String model) {
        this.vin = vin;
        this.yearOfProduction = yearOfProduction;
        this.brand = brand;
        this.model = model;
    }

    public void printInformation() {
        System.out.println("Car brand: " + brand);
        System.out.println("Car model: " + model);
        System.out.println("Year of production: " + yearOfProduction);
        System.out.println("VIN number: " + vin);
    }
}
package week2;

public abstract class Vehicle {
    String brand;

    public Vehicle(String brand){
        this.brand = brand;
    }

    public abstract String fuelType();

    public void printInfo(){
        System.out.println("Branding: " + brand);
        System.out.println("Fuel type: " + fuelType());
    }
}

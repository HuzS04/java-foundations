package week2;

public class ElectricCar extends Vehicle{

    public ElectricCar(String brand){
        super(brand);
    }
    @Override
    public String fuelType() {
        return "Electricity";
    }
}

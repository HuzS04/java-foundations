package week2;

public class PetrolCar extends Vehicle{

    public PetrolCar(String brand){
        super(brand);
    }

    @Override
    public String fuelType() {
        return "Petrol";
    }
}

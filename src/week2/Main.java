package week2;

public class Main {
    public static void main(String[] args){
        BankAccount bankAccount = new BankAccount("Dave", 500.50);

        System.out.println(bankAccount.getBalance());
        bankAccount.deposit(100);
        System.out.println(bankAccount.getBalance());
        bankAccount.deposit(0);

        bankAccount.withdraw(200);
        System.out.println(bankAccount.getBalance());
        bankAccount.withdraw(500);

        ElectricCar electricCar = new ElectricCar("Tesla");
        PetrolCar petrolCar = new PetrolCar("Toyota");
        Vehicle[] vehicles = {electricCar, petrolCar};

        for(Vehicle vehicle : vehicles){
            vehicle.printInfo();
        }
    }
}

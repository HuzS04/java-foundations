package week2;

public class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner, double balance){
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(double amount){
        if(amount <= 0){
            System.out.println("Please enter a valid amount to deposit");
        } else {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Please enter a valid amount to withdraw");
        } else if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds");
        } else {
            balance -= amount;
        }
    }

    public double getBalance(){
        return balance;
    }

    public void printStatement(){
        System.out.println("Owner: " + owner);
        System.out.println("Current balance: " + balance);
    }
}

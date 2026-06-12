package week2;

public class Dog extends Animal {
    public Dog(String name, int age){
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating dog food.");
    }

    public void bark(){
        System.out.println(name + " says woof!");
    }
}

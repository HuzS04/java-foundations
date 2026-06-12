package week2;

public class Main {
    public static void main(String[] args){
        Animal animal = new Animal("Generic Animal", 7);
        Dog dog = new Dog("Bob", 6);
        Cat cat = new Cat("John", 5);
        animal.eat();
        dog.eat();
        cat.eat();
        dog.sleep();
        dog.bark();
        cat.meow();
    }
}

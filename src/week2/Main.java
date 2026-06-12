package week2;

public class Main {
    public static void main(String[] args){
        Animal[] animals = {
                new Dog("Rex", 3),
                new Cat("Whiskers", 4),
                new Animal("Generic", 5),
                new Bird("Feathers", 4)
        };

        for (Animal animal : animals){
            animal.eat();
            if(animal instanceof Dog){
                Dog dog = (Dog) animal;
                dog.bark();
            } else if (animal instanceof Bird) {
                Bird bird = (Bird) animal;
                bird.fly();
            }
        }
    }
}

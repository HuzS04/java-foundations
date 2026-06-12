package week2;

public class Cat extends Animal{
    public Cat(String name, int age){
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating cat food.");
    }

    public void meow(){
        System.out.println(name + " says meow!");
    }
}

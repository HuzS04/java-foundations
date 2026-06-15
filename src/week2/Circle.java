package week2;

public class Circle extends Shape {
    double radius;

    public Circle(String colour, double radius){
        super(colour);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void describe() {
        System.out.println("I am a " + colour + " circle with a radius " + radius);
    }
}

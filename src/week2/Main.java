package week2;

public class Main {
    public static void main(String[] args){
        Circle circle = new Circle("Blue", 5);
        Rectangle rectangle = new Rectangle("Red", 3, 4);

        System.out.println("Area: " + String.format("%.2f", circle.calculateArea()));
        circle.printColour();
        circle.describe();

        System.out.println("Area: " + String.format("%.2f", rectangle.calculateArea()));
        rectangle.printColour();
        rectangle.describe();
    }
}

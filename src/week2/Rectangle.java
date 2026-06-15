package week2;

public class Rectangle extends Shape{
    double height;
    double width;

    public Rectangle(String colour, double height, double width){
        super(colour);
        this.height = height;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return height * width;
    }

    @Override
    public void describe() {
        System.out.println("I am a " + colour + "  rectangle with a height of " + height + "  and width of " + width);
    }
}

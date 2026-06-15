package week2;

public abstract class Shape implements Describable {
    String colour;

    public Shape(String colour){
        this.colour = colour;
    }

    public abstract double calculateArea();

    public void printColour(){
        System.out.println("Shape colour: " + colour);
    }
}

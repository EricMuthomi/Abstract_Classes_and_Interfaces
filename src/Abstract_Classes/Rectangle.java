package Abstract_Classes;
    //Helper class extending Shape
public class Rectangle extends Shape{
    int length, width;

    //constructor
    Rectangle(int length, int width, String name){
        super(name);
        this.length = length;
        this.width = width;
    }

    //implement the methods for the abstract class
    @Override
    public void draw() {
        System.out.println(" A rectangle has been drawn.");
    }
    @Override
    public double area() {
        return (double)(length * width);
    }
}

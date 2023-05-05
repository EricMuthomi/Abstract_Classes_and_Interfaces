package Abstract_Classes;

public class Circle extends Shape{
    private static final double pi = 3.14;
    int radius;

    Circle(int radius, String name){
        super(name);
        this.radius = radius;
    }

    //Implement the abstract class methods

    @Override
    public void draw() {
        System.out.println("A circle has been drawn.");
    }
    @Override
    public double area() {
        return (double)(pi * radius * radius);
    }


}

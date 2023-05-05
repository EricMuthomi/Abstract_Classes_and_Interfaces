package Abstract_Classes;

public class Main {
    public static void main(String[] args) {
    //Creating objects for the subclasses and using the Shape class reference

        Shape rectangle1 = new Rectangle(20, 10,"Rectangle");

        System.out.println("Area of rectangle: "+rectangle1.area());

        rectangle1.createShape(20, 10);

        System.out.print("");


        Shape circle1 = new Circle(14,"Circle");

        System.out.println("Area of Circle: "+circle1.area());

        circle1.createShape((int) 3.14, 14);
    }
}
package Abstract_Classes;

public abstract class Shape {
    String name = "";

    Shape(String name){
        this.name = name;
    }

    //A non-abstract method
    public void createShape(int a, int b){
        System.out.println("This "+this.name+
                " was created from point a "+a
                +" and point b "+b+".");
    }

    //Abstract methods that will be implemented by the subclasses
    abstract public double area();
    abstract public void draw();

}

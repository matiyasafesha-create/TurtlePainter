import java.awt.*;
import java.awt.geom.Point2D;

public class Triangle extends Shape {
    private double base;
    private double height;


    public Triangle(Turtle turtle, double border, Color color, Point2D location, double base , double height) {
        super(turtle, border, color, location);
        this.base= base;
        this.height = height;
    }
    @Override
    public void paint(){
        turtle.penUp();
        turtle.goTo(getLocation().getX(),getLocation().getY());
        turtle.penDown();
        turtle.setColor(color);
        turtle.setPenWidth(border);





    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}

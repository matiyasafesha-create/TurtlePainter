import java.awt.*;
import java.awt.geom.Point2D;

public class Circle extends  Shape {
    private double radius;

    public Circle(Turtle turtle, double border, Color color, Point2D location, double radius) {
        super(turtle, border, color, location);
        this.radius = radius;
    }

    @Override
    public void paint(){

    }




}

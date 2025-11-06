import java.awt.*;
import java.awt.geom.Point2D;

public class Square extends Shape{
    private double sides;

    public Square(Turtle turtle, double border, Color color, Point2D location, double sides) {
        super(turtle, border, color, location);
        this.sides = sides;
    }


    @Override
    public void paint(){

    }

}

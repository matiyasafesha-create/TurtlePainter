import java.awt.*;
import java.awt.geom.Point2D;

public abstract class Shape implements draw{
    Turtle turtle;
    protected Point2D Location;
    protected Color color;
    protected double border;

    public Shape(Turtle turtle, double border, Color color, Point2D location) {
        this.turtle = turtle;
        this.border = border;
        this.color = color;
        Location = location;
    }

    public Turtle getTurtle() {
        return turtle;
    }

    public void setTurtle(Turtle turtle) {
        this.turtle = turtle;
    }

    public Point2D getLocation() {
        return Location;
    }

    public void setLocation(Point2D location) {
        Location = location;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getBorder() {
        return border;
    }

    public void setBorder(double border) {
        this.border = border;
    }

    public abstract void paint(Turtle turtle);


}

import java.awt.*;
import java.awt.geom.Point2D;

public class Triangle extends Shape {
   public   double sideLength;



    public Triangle(Turtle turtle, double border, Color color, Point2D location, double sideLength) {
        super(turtle, border, color, location);
     this.sideLength = sideLength;
    }
    @Override
    public void paint(Turtle turtle){
        turtle.penUp();
        turtle.goTo(getLocation().getX(),getLocation().getY());
        turtle.penDown();
        turtle.setColor(color);
        turtle.setPenWidth(border);

        for(int i = 0 ; i < 3 ; i++){
            turtle.forward(sideLength);
            turtle.turnRight(120);
        }

    }
}

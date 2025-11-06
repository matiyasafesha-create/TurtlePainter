import java.awt.*;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class MainApp
{
    public static final Scanner scanner = new Scanner(System.in);
    private static final List<Shape> importShape = new ArrayList<>();


    public static void main(String[] args)
    {

        World world = new World(400, 400);
        Turtle turtle = new Turtle(world);

        boolean running = true;

        while(running) {
            System.out.println("======= Home Screen =======");
            System.out.println("1 - Add Shape\n" + "2 - Save Image\n" + "0 - Exit\n");
            System.out.print("Enter you Option:");
            int userInput = scanner.nextInt();

            switch (userInput) {
                case 1:
                    addShape();
                    break;
                case 2:

                    break;

                case 0:
                    systemExit();
                    break;

                default:
                    System.out.println("Invalid Option Try Again ");


            }


        }













        // This starter code to get you familiar with how
        // the TurtleLogo application works

        // The world is your canvas
//        World world = new World(200, 200);
//        Turtle turtle = new Turtle(world,-100, -100);
//
//        int width = 200;
//        int height = 200;
//
//        // calculate the hypotenuse (diagonal)
//        // a2 + b2 = c2
//        double widthSquared = Math.pow(width, 2);
//        double heightSquared = Math.pow(height, 2);
//        double hypotenuse = Math.sqrt(widthSquared + heightSquared);
//
//
//
//        turtle.setPenWidth(3);
//        turtle.setColor(Color.GREEN);
//
//        turtle.turnRight(45);
//        turtle.forward(hypotenuse);
//
//        turtle.penUp();
//        turtle.goTo(100, 100);
//        turtle.turnRight(90);
//
//        turtle.penDown();
//        turtle.forward(hypotenuse);
//
   }

    private static void systemExit() {
        System.out.println("You Have Exited The Application GoodBye");
        System.exit(0);
    }

    private static void addShape(){
        System.out.println(" Which Shape:"  );
        System.out.println("1 - Square \n" +
                "2 - Circle \n" + "3 - triangle \n");
        System.out.print("Enter Your Option here: ");
        int userInput2 = scanner.nextInt();
        switch (userInput2){
            case 1:
                square();
                break;

            case 2:
                circle();
                break;

            case 3:
                triangle();
                break;

            default:
                System.out.println("Error Wrong Entry Please Try Again: ");
        }




    }

    private static void circle(){
        scanner.nextLine();
        System.out.println("Details about The Circle: ");
        System.out.print("Enter the radius: ");
        double userRadius = scanner.nextDouble();

        System.out.print("What is the border width?");
        double userWidth = scanner.nextDouble();

        System.out.print("What is the border color?");
        String userColor = scanner.nextLine();

        System.out.print("What is the location of the shape (x,y)");
        int userLocation = scanner.nextInt();

    }

    private static void square (){
        scanner.nextLine();

        System.out.print("What is the border width?");
        double userWidth = scanner.nextDouble();

        System.out.print("What is the border color?");
        String userColor = scanner.nextLine();

        System.out.print("What is the location of the shape (x,y)");
        int userLocation = scanner.nextInt();

    }

    private static void triangle(){
        System.out.print("What is the border width?");
        double userWidth = scanner.nextDouble();

        System.out.print("What is the border color?");
        String userColor = scanner.nextLine();
        Color color = Color.decode("#FF0000");

        System.out.print("Enter X location: ");
        int userXinput = scanner.nextInt();

        System.out.print("Enter Y location: ");
        int userYinput = scanner.nextInt();
        Point2D location = new Point2D.Double(userXinput , userYinput);


        Triangle triangle = new Triangle(userWidth, color, location, sideLength);
        triangle.paint(turtle);

    }


}

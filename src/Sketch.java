import processing.core.PApplet;
import java.util.ArrayList;
import java.util.Collections;

public class Sketch extends PApplet{
    ArrayList<Shape> shapes = new ArrayList<Shape>();

    public void settings(){
        size(400,400);
    }

    public void setup(){
        add(shapes);
        display(shapes);
        System.out.println(String.format("The total number of shapes created are: %d", Shape.getNumShapes()));
        System.out.println("Ordered Shapes (Ascending): ");
        Collections.sort(shapes);
        display(shapes);
    }

    public void draw(){
        //rect(0,0,100,100);
        for(Shape shape : shapes){
            shape.draw(this);
        }
    }

    private static void add(ArrayList<Shape> shapes) {
        shapes.add(new Circle(new Point(200.0, 200.0), 50.0));
        shapes.add(new Circle(new Point(300.0, 300.0), 100.0));
        shapes.add(new Circle(new Point(50.0, 0.0), 130.0));
        shapes.add(new Rectangle(new Point(50.0, 50.0), 10.0, 40.0));
        shapes.add(new Rectangle(new Point(20.0, 150.0), 2.0, 10.0));
        shapes.add(new Rectangle(new Point(0.0, 0.0), 20.0, 20.0));
    }

    private static void display(ArrayList<Shape> shapes) {
        for(Shape shape: shapes){
            System.out.println(shape);
        }
    }
}

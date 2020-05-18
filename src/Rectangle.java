public class Rectangle extends Shape  {

    private double length, height;

    Rectangle(Point upperLeft, double length, double height) {
        super(upperLeft);
        this.length = length;
        this.height = height;
    }

    public double computeArea() { return  length*height; }
    public double getPerimeter() {return 2*length + 2*height;}

}

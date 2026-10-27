public class Main {
    public static void main(String[] args) {
        Triangle MyTriangle = new Triangle(5.0, 10.0, 12.0);
        MyTriangle.tCount();
        Rectangle MyRectangle = new Rectangle(5.0, 10.0);
        MyRectangle.rCount();
        Circle MyCircle = new Circle(5.0);
        MyCircle.cCount();
    }
}
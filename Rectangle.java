public class Rectangle {
    double length;
    double width;
    double rperimeter;
    double rarea;
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    public void rCount(){
        rperimeter = (length + width) * 2;
        rarea = length * width;
        System.out.println("Стороны прямоугольника: " + length + ", " + width);
        System.out.println("Периметр равен " + rperimeter);
        System.out.println("Площадь равна " + rarea);
    }
}

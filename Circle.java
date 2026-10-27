public class Circle {
    double radius;
    double cperimeter;
    double carea;
    public static final double PI = 3.1415;
    public Circle(double radius){
        this.radius = radius;
    }
    public void cCount (){
        cperimeter = 2 * PI * radius;
        carea = PI * radius * radius;
        System.out.println("Радиус окружности: " + radius);
        System.out.println("Периметр равен " + cperimeter);
        System.out.println("Площадь равна " + carea);

    }
}

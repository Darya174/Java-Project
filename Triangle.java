public class Triangle {
    double side1;
    double side2;
    double side3;
    double tperimeter;
    double tarea;
    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public void tCount() {
        tperimeter = side1 + side2 + side3;
        tarea = Math.pow(((tperimeter/2) * (tperimeter/2 - side1) * (tperimeter/2 - side2) * (tperimeter/2 - side3)), 0.5);
        System.out.println("Стороны треугольника: " + side1 + ", " + side2 + ", " + side3);
        System.out.println("Периметр равен " + tperimeter);
        System.out.println("Площадь равна " + tarea);
    }
}

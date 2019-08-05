package ru.JavaLearn.sandbox;

public class MyFirstProgram1 {
    public static void main(String[] args) {
        Square s = new Square(6);
        Rectangle r = new Rectangle(4, 6);
        Point p1 = new Point(3, 4);
        Point p2 = new Point(5, 6);

        System.out.println("Расстояние между точками равно " + p1.distance(p1, p2));

        hello("user");
        hello("Kate");

        System.out.println("Площадь квадрата со стороной " + s.l + " равна " + s.area());
        double a = 4;
        double b = 6;
        System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " равна " + r.area());

    }

    public static void hello(String somebody) {

        System.out.println("Hello,  " + somebody);
    }

    public static double distance(Point p1, Point p2) {
        return Math.sqrt((p2.x - p1.x) ^ 2 + (p2.y - p1.y) ^ 2);

    }

}

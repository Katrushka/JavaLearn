package ru.JavaLearn.sandbox;

public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow((p2.x - p1.x), 2) + Math.pow((p2.y - p1.y), 2));

    }

    public static void main(String[] args) {
        Point p1 = new Point(5, -7);
        Point p2 = new Point(60, 0);
        System.out.println("Расстояние между точками: (" + p1.x + ", " + p1.y + ")"
                + " и " + "(" + p2.x + ", " + p2.y + ")" + " = " + p1.distance(p1, p2));
    }

}
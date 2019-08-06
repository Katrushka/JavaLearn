package ru.JavaLearn.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {
    @Test
    public void positiveTestDistanceBetweenTwoPoints() {
        Point p1 = new Point(3,5);
        Point p2 = new Point(4,5);
        Assert.assertEquals(p1.distance(p2), 1);
    }

    @Test
    public void noDistanceBetweenTwoPointsTest() {
        Point p1 = new Point(1,5);
        Point p2 = new Point(1,5);
        Assert.assertEquals(p1.distance(p2), 0);
    }

    @Test
    public  void firstPointHasNegativeCoordinatesTest() {
        Point p1 = new Point(-10,-5);
        Point p2 = new Point(1,5);
        Assert.assertEquals(p1.distance(p2), 14.866068747318506);
    }

    @Test
    public  void secondPointHasNegativeCoordinatesTest() {
        Point p1 = new Point(1,5);
        Point p2 = new Point(-10,-5);
        Assert.assertEquals(p1.distance(p2), 14.866068747318506);
    }
}

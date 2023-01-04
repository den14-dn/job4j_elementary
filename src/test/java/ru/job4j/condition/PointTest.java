package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point p1 = new Point(0, 0);
        Point p2 = new Point(2, 0);
        double out = p2.distance(p1);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when13to33then2() {
        double expected = 2;
        Point p1 = new Point(1, 3);
        Point p2 = new Point(3, 3);
        double out = p2.distance(p1);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when13to23then1() {
        double expected = 1;
        Point p1 = new Point(1, 3);
        Point p2 = new Point(2, 3);
        double out = p2.distance(p1);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when13to47then5() {
        double expected = 5;
        Point p1 = new Point(1, 3);
        Point p2 = new Point(4, 7);
        double out = p2.distance(p1);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when132to472then5() {
        double expected = 5;
        Point p1 = new Point(1, 3, 2);
        Point p2 = new Point(4, 7, 2);
        double out = p2.distance3d(p1);
        Assert.assertEquals(expected, out, 0.01);
    }
}
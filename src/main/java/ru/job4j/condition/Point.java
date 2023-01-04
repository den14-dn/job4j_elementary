package ru.job4j.condition;

import static java.lang.Math.*;

public class Point {
    private int x;
    private int y;
    private int z;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distance(Point point) {
        return sqrt(pow(this.x - point.x, 2) + pow(this.y - point.y, 2));
    }

    public double distance3d(Point point) {
        return sqrt(pow(this.x - point.x, 2) + pow(this.y - point.y, 2) + pow(this.z - point.z, 2));
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        System.out.println("result (0, 0) to (0, 2) " + dist);
    }

    public void info() {
        System.out.println("Point[" + this.x + ", " + this.y + "]");
    }
}

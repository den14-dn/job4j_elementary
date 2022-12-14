package ru.job4j.condition;

import static java.lang.Math.*;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        double result = Point.distance(1, 2, 2, 4);
        System.out.println("result (1, 2) to (2, 4) " + result);
    }
}

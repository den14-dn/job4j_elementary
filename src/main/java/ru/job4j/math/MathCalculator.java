package ru.job4j.math;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double sumByResultAboutMinusAndDiv(double first, double second) {
        return sum(minus(first, second), div(first, second));
    }

    public static double sumByFourOperationsCalculator(double first, double second) {
        return sum(sum(sum(first, second), multiply(first, second)), sum(minus(first, second), div(first, second)));
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + sumByResultAboutMinusAndDiv(20, 10));
        System.out.println("Результат расчета равен: " + sumByFourOperationsCalculator(1, 2));
    }
}

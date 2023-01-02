package ru.job4j.calculator;

public class Calculator {
    private static int x = 5;

    public static void main(String[] args) {
        int one = 1;
        int two = 2;
        int six = 6;
        int four = 4;
        int five = 5;
        int onePlusTwo = one + two;
        int sixDivTwo = six / two;
        int fiveMinusTwo = five - two;
        int fourTimeTwo = four * two;
        System.out.println(onePlusTwo);
        System.out.println(sixDivTwo);
        System.out.println(fiveMinusTwo);
        System.out.println(fourTimeTwo);

        System.out.println("sum: " + sum(5));
        System.out.println("multiply: " + multiply(5));
        System.out.println("minus: " + minus(5));

        Calculator calculator = new Calculator();
        System.out.println("divide: " + calculator.divide(5));
        System.out.println("sumAllOperation: " + calculator.sumAllOperation(5));
    }

    private static int sum(int value) {
        return value + x;
    }

    private static int multiply(int value) {
        return value * x;
    }

    private static int minus(int value) {
        return value - x;
    }

    private int divide(int value) {
        return value / x;
    }

    private int sumAllOperation(int value) {
        return sum(value) + multiply(value) + minus(value) + divide(value);
    }
}

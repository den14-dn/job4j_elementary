package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        System.out.println("Размер массива ages равен: " + ages.length);
        System.out.println("Размер массива surname равен: " + surnames.length);
        System.out.println("Размер массива prices равен: " + prices.length);
        String[] names = new String[4];
        names[0] = "John";
        names[1] = "Michal";
        names[2] = "Jan";
        names[3] = "Nick";
        System.out.println("Имя под индексом 0: " + names[0]);
        System.out.println("Имя под индексом 1: " + names[1]);
        System.out.println("Имя под индексом 2: " + names[2]);
        System.out.println("Имя под индексом 3: " + names[3]);
    }
}

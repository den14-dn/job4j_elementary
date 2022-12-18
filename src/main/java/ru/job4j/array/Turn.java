package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int bound = array.length / 2;
        for (int i = 0; i < bound; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }
}

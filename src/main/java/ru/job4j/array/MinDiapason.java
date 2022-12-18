package ru.job4j.array;

public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        int bound = start + finish;
        for (int i = start + 1; i < bound; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}

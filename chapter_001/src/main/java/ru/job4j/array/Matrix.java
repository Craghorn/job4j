package ru.job4j.array;

public class Matrix {
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int index2 = 1; index2 <= size; index2++) {
        for (int index1 = 1; index1 <= size; index1++) {
           table[index1 - 1][index2 - 1] = index1 * index2;
        }
        }
        return table;
    }
}
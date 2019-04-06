package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 0;
        if (n == 0) {
            return 1;
        }
        for (result = 1; 1 < n; n--) {
            result = result * n;
        }
        return result;
    }
}

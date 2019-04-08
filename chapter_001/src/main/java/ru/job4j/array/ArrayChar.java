package ru.job4j.array;

/**
 * Обертка над строкой.
 */
public class ArrayChar {
    private char[] data;

    public ArrayChar(String line) {
        this.data = line.toCharArray();
    }

    /**
     * Проверяет, что слово начинается с префикса.
     * @param prefix префикс.
     * @return если слово начинается с префикса
     */
    public boolean startWith(String prefix) {
        boolean result = true;
        char[] value = prefix.toCharArray();
        // проверить, что массив data имеет первые элементы, одинаковые с value
        if (data[1] != value[1] || data [0] != value[0]) {
            result = false;
        }

        return result;
    }
}
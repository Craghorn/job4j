package ru.job4j.array;

public class MatrixCheck {
    public boolean mono(boolean[][] data) {
        boolean result = true;
            if (data.length % 2 != 0) {
                int index1 = 0, index2 = 0;
                for (; index1 < data[0].length; index1++, index2++) {
                    if (!data[index1][index2]) {
                        result = false;
                        break;
                    }
                }
                for (index1 = data[0].length - 1; index2 < data[0].length; index2++, index1--) {
                    if (!data[index1][index2]) {
                        result = false;
                        break;
                    }
                }
            } else {
                int index1 = 0, index2 = 0;
                int index3 = 1, index4 = 1;
                for (index3 = 1, index4 = 1; index3 <= data[0].length - 1; index1++, index2++, index3++, index4++) {
                    if (data[index1][index2] != data[index3][index4]) {
                        result = false;
                        break;
                    }
                }
                for (index1 = data[0].length - 1, index3 = data[0].length - 2, index4 = 1, index2 = 0; index3 >= 0; index2++, index1--, index3--, index4++) {
                    if (data[index1][index2] != data[index3][index4]) {
                        result = false;
                        break;
                    }
                }
            }
        return result;
    }
}
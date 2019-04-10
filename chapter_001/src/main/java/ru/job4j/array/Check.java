package ru.job4j.array;
//Метод должен проверить, что все элементы в массиве являются true или false.
//
//Например.
//{true, true, true} - вернет true;
//{true, false, true} - вернет false;
//{false, false, false} - вернет true;
public class Check {
    public boolean mono(boolean[] data) {
        boolean result = false;
        for (int index = 0; data.length > index + 1; index++) {
            if (data[index] != data[index + 1]) {
                result = false;
                break;
            } else {
                result = true;
            }
        }
        return result;
    }
}

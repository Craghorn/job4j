//1. Необходимо создать класс Board.
//2. В классе Board написать метод public String paint(int width, int height), который должен рисовать шахматную доску из символов x и пробелов.
//3. width - это ширина доски, height - это высота доски.
//4. Для сложения строк использовать класс StringBuilder и методы append(String), String toString().
//1. В этой задаче вам необходимо сформировать доску в виде строки без вывода в консоль.
//2. Здесь должно быть 2 цикла - внешний отвечает за высоту доски, вложенный отвечает за ширину доски.
//3. Внутри вложенного цикла необходимо написать условия прорисовки клеток доски (x и пробелы).
//4. Высота доски достигается за счёт переходов на новую линию. В Windows это "\r\n", в Linux - "\n".
// Универсальный вариант, который вам необходимо использовать, это System.getProperty("line.separator") - автоматически определяет переход в зависимости от ОС.
//5. Класс StringBuilder служит для построения строки, метод append добавляет символы и строки в некоторый буфер StringBuilder вместо вывода на консоль.
// При вызове метода toString для StringBuilder  он возвращает все добавленные в него символы и строки в одну строк
package ru.job4j.loop;

public class Board {
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int vis = 1; (height - vis) >= 0; vis++) {
            for (int shir = 1; (width - shir) >= 0; shir++) {
                // условие проверки, что писать пробел или X
                // Выше в задании мы определили закономерность, когда нужно проставлять X
                if ((vis + shir) % 2 == 0) {
                    screen.append("x");
                } else {
                    screen.append(" ");
                }
            }
            // добавляем перевод на новую строку.
            screen.append(ln);
        }
        return screen.toString();
    }
}

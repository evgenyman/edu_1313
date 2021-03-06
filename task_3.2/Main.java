/*
Написать функцию, которая вычисляет минимум из четырёх чисел.
Функция min(a,b,c,d) должна использовать (вызывать) функцию min(a,b)
Подсказка:
Нужно написать тело двух существующих функций min.
Требования:
•	Программа должна выводить текст на экран.
•	Методы min не должны выводить текст на экран.
•	Метод main должен вызывать метод min(a, b) и метод min(a, b, c, d).
•	Метод main должен выводить на экран результат работы методов min. Каждый раз с новой строки.
•	Метод min(a, b) должен возвращать минимальное значение из чисел a, b.
•	Метод min(a, b, c, d) должен использовать метод min(a, b)
•	Метод min(a, b, c, d) должен возвращать минимальное значение из чисел a, b, c, d.
*/

public class Main {

    public static int min(int a, int b, int c, int d) {
        //напишите тут ваш код
        //System.out.println("Разбираем длинную строку : "+a+" "+b+" "+c+" "+d);        // можно убрать комментарий и станет понятнее
        int x = min(a,b);
        //System.out.println("min короткой строки = "+x);       // можно брать комментарий и станет понятнее
        if (x<=c)
            if (x <= d)
                return x;
                    if (c <= d)
                return c;
            return d;
    }

    public static int min(int a, int b) {
        //напишите тут ваш код
        //System.out.println("Разбираем короткую строку : "+a+" "+b);       // можно убрать комментарий и станет понятнее
        if (a<=b)
            return a;
        else
            return b;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("min короткой строки = "+min(-20, -10));
        System.out.println("min 1-й длинной строки = "+min(-40, -10, -30, 40));     // min=-40
        System.out.println("min 2-й длинной строки = "+min(-20, -40, -30, 40));     // min=-40
        System.out.println("min 3-й длинной строки = "+min(-20, -10, -40, 40));     // min=-40
        System.out.println("min 4-й длинной строки = "+min(-20, -10, -30, -40));    // min=-40
    }
}

/* Написать функцию, которая вычисляет минимум из трёх чисел.
Требования:
•	Программа должна выводить текст на экран.
•	Метод min не должен выводить текст на экран.
•	Метод main должен вызвать метод min четыре раза.
•	Метод main должен выводить на экран результат работы метода min. Каждый раз с новой строки.
•	Метод min должен возвращать минимальное значение из чисел a, b и с.
*/


public class Main {

    public static void main(String[] args) {
        System.out.println("min = "+min(1, 2, 3));       // min = 1
        System.out.println("min = "+min(-1, -2, -3));    // min = -3
        System.out.println("min = "+min(3, 5, 3));       // min = 3
        System.out.println("min = "+min(5, 5, 10));      // min = 5
    }

    public static int min(int a, int b, int c) {
        //напишите тут ваш код
        System.out.println("Разбираем строку : "+a+" "+b+" "+c);
        if (a<=b)
            if (a<=b)
                return a;
            else
                return b;
        else if (b<=c)
            return b;
        return c;
    }
}

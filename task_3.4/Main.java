/*
Задание: Сделайте функцию, которая параметрами принимает 2 числа. Если их сумма больше 10 - пусть функция вернет true, а если нет - false.

*/

import java.util.Scanner;                             // это я 'импортирую' в наш код внешний Метод 'Scanner' (позволяет считывать с экрана вводимый пользователем текст)

public class Main {
    public static void main(String[] args) {
        //напишите тут ваш код

        Scanner vvodChisla = new Scanner(System.in);  // необходимо обязательно создать новый Экземпляр Метода 'Scanner' - я его назвал как vvodChisla

        System.out.print("Введите первое число: ");
        int a = vvodChisla.nextInt();                 // записал в переменную 'a' результат ввода с клавиатуры используя vvodChisla
        System.out.print("Введите второе число: ");
        int b = vvodChisla.nextInt();                 // записал в переменную 'b' результат ввода с клавиатуры используя vvodChisla

        System.out.println("Сумма двух чисел > 10? : "+myFunction(a,b)); // myFunction - это внешняя Функция, которая описана ниже и в которую я передаю параметры 'a' и 'b'
    }

    public static boolean myFunction(int x, int y) {  // здесь важно использовать 'boolean' для того, чтобы функция Могла вернуть 'true' или 'false' (не использовать 'int' или 'void')
        if (x+y>10) return true;
        else return false;
    }
}

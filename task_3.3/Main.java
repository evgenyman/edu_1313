/*
Задание: Сделайте функцию, которая параметрами принимает 2 числа. Если эти числа равны - пусть функция вернет true, а если не равны - false.
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //напишите тут ваш код

        Scanner vvodChisla = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int a = vvodChisla.nextInt();
        System.out.print("Введите второе число: ");
        int b = vvodChisla.nextInt();

        System.out.println("Результат сравнения двух чисел: "+ravenstvo(a,b));
    }

    public static boolean ravenstvo(int x, int y) {  // здесь важно использовать 'boolean' для того, чтобы функция Могла вернуть 'true' или 'false' (не использовать 'int' или 'void')
        if (x==y) return true;
        else return false;
    }
}

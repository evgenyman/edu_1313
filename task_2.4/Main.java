/*
Задание: Пользователь вводит сумму вклада и процент, который будет начисляться ежегодно. Отобразить размер вклада поочередно на ближайшие 5 лет.
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.print("Введите сумму вклада ");
        int a = vvod.nextInt();
        System.out.print("Введите процент ");
        int b = vvod.nextInt();
        //напишите тут ваш код
        for (int i = 0; i < 5; i++) {
            System.out.println(a+a*b/100);
            a = a + a*b/100;
        }

    }
}

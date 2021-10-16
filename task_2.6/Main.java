/*
Задание: Даны переменные a и b. Проверьте, что a делится без остатка на b. Если это так - выведите 'Делится'
и результат деления, иначе выведите 'Делится с остатком' и остаток от деления.
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Ваш код
        Scanner vvod = new Scanner(System.in);
        System.out.print("Введите число а ");
        int a = vvod.nextInt();
        System.out.print("Введите число b ");
        int b = vvod.nextInt();
        if (a%b==0)
            System.out.println("Делится без остатка!");
        else
            System.out.println("Делится с остатком - "+a%b);


    }
}

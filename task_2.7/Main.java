/*
Задание: Дано число, например 31. Проверьте, что это число не делится ни на одно другое число (без остатка?)
 кроме себя самого и единицы. То есть в нашем случае нужно проверить, что число 31 не делится
  на все числа от 2 до 30. Если число не делится - выведите 'false', а если делится - выведите 'true'.
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Ваш код
        Scanner vvod = new Scanner(System.in);
        System.out.print("Введите произвольное число ");
        int a = vvod.nextInt();
        for (int i = 2; i<a; i++) {
            if (a%i!=0)
                System.out.println("false. Не делится без остатка ни на что кроме самого себя и 1");
            else
                System.out.println("true. Делится без остатка минимум на "+i);
            break;
        }

    }
}

/*
Пользователь вводит число, необходимо увеличить это число на 15% и вывести результат на экран
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Ваш код
        Scanner chislo = new Scanner(System.in);
        System.out.println("Введите число");
        int x = chislo.nextInt();
        double y = x+x*0.15;
        System.out.println("Увеличенноe на 15% число: "+y);
    }
}

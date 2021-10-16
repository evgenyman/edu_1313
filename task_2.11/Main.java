/*
Задание: Дан массив с числами. Узнайте сколько элементов с начала массива надо сложить,
чтобы в сумме получилось больше 10-ти.
*/

public class Main {
    public static void main(String[] args) {
        //напишите тут ваш код
        int [] mass = {1,2,3,4,5,6,7,8,9,10};
        int summ = 0;
        int elem = 1;
        for (int i = 0; i < mass.length; i++) {
            summ = summ + mass[i];
            elem= 1 + i;
            System.out.println("Сумма = "+summ);
            System.out.println("Посчитано элементов "+elem);
            if (summ>10) {
                System.out.println("Надо сложить " + elem + " элементов");
                break;
            }
        }

    }
}

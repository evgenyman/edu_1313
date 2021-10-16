/*
Задание: Дан массив с числами. Проверьте, что в этом массиве есть число 5.
Если есть - выведите 'да', а если нет - выведите 'нет'.
*/

public class Main {
    public static void main(String[] args) {
        //напишите тут ваш код
        int[] mass = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < mass.length; i++) {
            if (mass[i]!=5)
                System.out.println(mass[i]);
            else
                System.out.println("Да. В массиве есть число 5");
        }
    }
}

/*
Задание: Дан массив с числами. Проверьте, есть ли в нем два одинаковых числа подряд.
Если есть - выведите 'да', а если нет - выведите 'нет'.
*/

public class Main {
    public static void main(String[] args) {
        //напишите тут ваш код
        int[] mass = {1,2,3,4,4,5};
        int a = mass[0];
        for (int i = 1; i < mass.length; i++) {
            if (a==mass[i])
                System.out.println("Есть два подряд одинаковых числа! Это "+a);
            else
                System.out.println(mass[i]);
            a = mass[i];
        }
    }
}

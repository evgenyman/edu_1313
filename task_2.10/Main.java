/*
Задание: Дан массив с числами. Проверьте, есть ли в нем два одинаковых числа подряд.
Если есть - выведите 'да', а если нет - выведите 'нет'.
*/

public class Main {
    public static void main(String[] args) {
        //напишите тут ваш код
        int[] mass = {10,20,30,40,40,50};
        int a = mass[0];
        for (int i = 1; i < mass.length; i++) {
            System.out.println("Считали элемент "+i+" он равен "+mass[i]);
            if (a==mass[i]) {
                System.out.println("Да. Есть два подряд одинаковых числа! Это " + a);
                break;
            }
            if (i==mass.length-1) {
                System.out.println("Нет. Массив окончен. Одинаковых подяд чисел нет");
            }
            a = mass[i];
        }
    }
}

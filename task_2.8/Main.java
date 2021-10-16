/*
Задание: Дан массив с элементами [2, 3, 4, 5]. С помощью цикла for найдите произведение
 элементов этого массива.
*/

public class Main {
    public static void main(String[] args) {
        //напишите тут ваш код
        int[] mass = {2,3,4,5};
        int a = 1;
        for (int i = 0; i < mass.length; i++) {
            a = a* mass[i];
        }
        System.out.println("Произведение элементов массива = "+a);
    }
}

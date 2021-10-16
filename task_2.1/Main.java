/*Вывести на экран все возможные комбинации слов "Мама", "Мыла", "Раму".
Каждую комбинацию вывести с новой строки. Слова не разделять.
Пример:
МылаРамуМама
РамуМамаМыла
...
Требования:
•	Программа должна выводить текст.
•	Текст в каждой строке должен быть уникален.
•	Должны быть выведены все возможные комбинации. */

public class Main {
    public static void main(String[] args) {
        //напишите тут ваш код
        String[] names = {"Мама","Мыла","Раму"};
        int a = names.length;
//        String stroka;
        
        for (int i=0; i<a; i++)
            System.out.print(names[i]);

//        for (int j=1; j<a; j++)
//            System.out.print(names[j]);

//        for (int k=2; k<a; k++)
//            System.out.print(names[k]);
    }
}

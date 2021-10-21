/*
Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Нужно сравнить каждый критерий по отдельности, и победителем будет тот, у которого больше "победивших" критериев.
Метод должен определять, выиграли ли мы (this) бой или нет, т.е. возвращать true, если выиграли и false - если нет.
Если ничья и никто не выиграл, возвращаем либо true либо false, по вашему усмотрению
Требования:
•	Класс Cat должен содержать конструктор без параметров.
•	Класс Cat должен содержать всего три поля: age, weight и strength. Поля должны быть публичные.
•	В классе Cat должен быть метод fight.
•	В методе fight реализовать механизм драки котов в зависимости от их веса, возраста и силы согласно условию.
•	Метод должен возвращать одно и тоже значение, если мы деремся с одним и тем же котом.
•	Если некий кот1 выигрывает у кота кот2, то кот2 должен проигрывать коту кот1.
*/

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.age = 17;
        cat.weight = 17;
        cat.strength = 17;

        Cat anotherCat = new Cat();
        anotherCat.age = 10;
        anotherCat.weight = 10;
        anotherCat.strength = 10;

        cat.displayInfo(anotherCat);
//        anotherCat.displayInfo(anotherCat);

        System.out.println("Первый кот сильнее второго? "+cat.fight(anotherCat));
        System.out.println("Второй кот сильнее первого? "+anotherCat.fight(cat));

    }
}

class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
        int hp1 = 0;
        int hp2 = 0;
        if (this.age > anotherCat.age) hp1 = hp1 + 1;
        else hp2 = hp2 + 1;
        if (this.weight > anotherCat.weight) hp1 = hp1 + 1;
        else hp2 = hp2 + 1;
        if (this.strength > anotherCat.weight) hp1 = hp1 + 1;
        else hp2 = hp2 + 1;

        if (hp1 > hp2) return true;
        else return false;
    }
    void displayInfo(Cat anotherCat) {
        System.out.println("Данные первого кота: "+this.age+" "+this.weight+" "+this.strength);
        System.out.println("Данные второго кота: "+anotherCat.age+" "+anotherCat.weight+" "+anotherCat.strength);
    }
}


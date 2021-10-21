/*
Создать абстрактный класс Animal с характеристиками животного.
Создать класс Horse который наследуется от Animal, в классе Horse реализовать метод public void run(){ System.out.println("Игого, я поскакал(а)"); }
Создать класс Pegasus который наследуется от Horse, в классе Pegasus реализовать метод public void fly(){ System.out.println("Игого, я полетел(а)"); }
Создать объект лошади и вызвать метод run();
Создать объект пегаса и вызвать метод fly();
*/

public class Main{
    public static void main(String[] args) {
        //Ваш код
        Animal animal = new Animal();
        Horse horse = new Horse(animal);
        horse.run();
        Pegasus pegasus = new Pegasus(horse);
        pegasus.fly();

    }
}

class Animal {
    public int age;
    public int wight;
    public Animal () {
    }
}

class Horse {
    public Horse (Animal animal) {
    }
    public void run() {
        System.out.println("Игого, я поскакал(а)");
    }
}

class Pegasus {
    public Pegasus (Horse pegasus) {
    }
    public void fly() {
        System.out.println("Игого, я полетел(а)");
    }
}

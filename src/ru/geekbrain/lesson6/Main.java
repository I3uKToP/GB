package ru.geekbrain.lesson6;


import static ru.geekbrain.lesson6.Animal.*;

public class Main {
    public static void main(String[] args) {

        Animal cat = new Cat("Jane", 6);
        Animal cat1 = new Cat("Бедняга", 3);
        Animal cat2 = new Cat("Бедняга", 3);
        Animal dog = new Dog ("Песель", 5);
        Animal dog1 = new Dog ("Очумелая", 8);
        Dog dog2 = new Dog ("22", 2);
        Dog dog3 = new Dog ("22", 2);

        cat.jump(1);
        cat1.jump(10);
        cat.run(50);
        cat1.run(500);
        cat1.swim(8);


        dog.jump(0.3);
        dog1.jump(3);
        dog.run(60);
        dog1.run(500);
        dog.swim(8);
        dog1.swim(20);

        System.out.println(Animal.getCount());
        System.out.println(Dog.getCount());
        System.out.println(Cat.getCount());

    }

}


package ru.geekbrain.lesson6;

public class Cat extends Animal {


    public Cat(String name, int age) {
        super(name, age);
        countCat++;
    }

    @Override
    public void run(int m) {
        if(m>0 && m <200) {
            System.out.println(this.name + " пробежал/а "+ m + " м");
        }
        else System.out.println(name + " не может так далеко пробежать");

    }

    @Override
    public void jump(double m) {
        if(m>0 && m <2) {
            System.out.println(this.name + " прыгнул на высоту "+ m + " м");
        }
        else System.out.println(name + " не смогла так высоко прыгнуть и врезалась в препятсвие");
    }

    @Override
    public void swim(int m) {
        System.out.println(name + " прыгнул/а в воду и утонула");
    }


}


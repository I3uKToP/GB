package ru.geekbrain.lesson6;

public class Cat extends Animal {

    public static final int MAX_RUN = 200;
    public static final int MAX_JUMP = 2;
    private static int count;


    public Cat(String name, int age) {
        super(name, age);
        count++;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public void run(int m) {
        if(m>0 && m <MAX_RUN) {
            System.out.println(this.name + " пробежал/а "+ m + " м");
        }
        else System.out.println(name + " не может так далеко пробежать");

    }

    @Override
    public void jump(double m) {
        if(m>0 && m <MAX_JUMP) {
            System.out.println(this.name + " прыгнул на высоту "+ m + " м");
        }
        else System.out.println(name + " не смогла так высоко прыгнуть и врезалась в препятсвие");
    }

    @Override
    public void swim(int m) {
        System.out.println(name + " прыгнул/а в воду и утонула");
    }


}


package ru.geekbrain.lesson6;

public class Dog extends Animal{

    private static int count;
    public Dog(String name, int age) {
        super(name, age);
        count++;

    }

    public static int getCount() {
        return count;
    }

    @Override
    public void run(int m) {
        int value = (int) (Math.random()*200) +400;
        if(m>0 && m <value) {
            System.out.println(this.name + " пробежал/а "+ m + " м");
        }
        else System.out.println(name + " не может так далеко пробежать");

    }

    @Override
    public void jump(double m) {
        if(m>0 && m <0.5) {
            System.out.println(this.name + " прыгнул на высоту "+ m + " м");
        }
        else System.out.println(name + " не смогла так высоко прыгнуть и врезалась в препятсвие");
    }

    @Override
    public void swim(int m) {
        int value = (int) (Math.random()*3) +8;
        if(m>0 && m <value) {
            System.out.println(this.name + " проплыл/а "+ m + " м");
        }
        else System.out.println(name + " не смогл/а столько проплыть и утонул/а");
    }

}


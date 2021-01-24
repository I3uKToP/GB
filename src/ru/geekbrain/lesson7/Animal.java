package ru.geekbrain.lesson7;

public abstract class Animal  {
    protected String name;
    protected int age;



    public static int count;


    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }

    public static int getCount(){
        return count;
    }

    public abstract void run(int m);
    public abstract void jump(double m);
    public abstract void swim(int m);

}

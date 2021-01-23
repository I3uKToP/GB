package ru.geekbrain.lesson6;

public abstract class Animal  {
    static int countCat=0;
    static int countDog=0;
    protected String name;
    protected int age;


    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void run(int m);
    public abstract void jump(double m);
    public abstract void swim(int m);


    public static void showCountDog (){
        System.out.println("Количество собак: "+countDog);
    }
    public static void showCountCat() {
        System.out.println("Количество кошек: " + countCat);
    }
    public static void showAnimal() {
        int summ = countCat+countDog;
        System.out.println("Количество животных: " + summ );
    }
}

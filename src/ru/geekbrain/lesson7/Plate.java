package ru.geekbrain.lesson7;

public class Plate {

    private int food;
    protected boolean checkFood = true;

    public Plate(int food) {
        this.food = food;
    }

    public void showInfo() {
        System.out.println("Еды в тарелке: "+food);
    }

    public void decreaseFood(int appetite) {

        if ((food - appetite) >=0) {
            this.food -= appetite;
        }
        else {
            System.out.println("Еды нет");
            checkFood = false;
        }

    }
    public void addFood (int food) {
        this.food += food;
    }

}

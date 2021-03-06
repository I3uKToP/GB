package ru.geekbrain.lesson5;

public class Employees {


    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employees(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public Employees() {
    }

    public void showInfo () {
        System.out.printf(" Фамилия, Имя, Отчество: %s\n Должность: %s\n Почта: %s\n Телефон: %s\n Зарплата: %s\n Возраст: %s\n",
                this.getName(), this.getPosition(), this.getEmail(), this.getPhone(), this.getSalary(), this.getAge());
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

package ru.geekbrain.lesson5;

public class Main {
    public static void main(String[] args) {
        //с полями: ФИО, должность, email, телефон, зарплата, возраст;

        Employees[] arrayEmployees = new Employees[5];
        arrayEmployees[0] = new Employees("Иванов Иван Иваныч", "ИТ девелопер", "ivanov@gmail.com", "+7-495-111-11-11", 150000, 30);
        arrayEmployees[1] = new Employees("Сидоров Петр Алексеевич", "дизайнер", "petrov@gmail.com", "+7-495-111-11-22", 100000, 40);
        arrayEmployees[2] = new Employees("Грозный Иван Васильевич", "Просто царь", "tsar@gmail.com", "+7-495-111-11-33", 1000, 50);
        arrayEmployees[3] = new Employees("Сталин Иосиф Виссарионович", "руководитель СССР", "stalin@gmail.com", "+7-495-222-11-33", 10000, 83);
        arrayEmployees[4] = new Employees("Бра́йан Хью Уо́рнер", "певец", "marly@gmail.com", "+7-495-666-66-66", 1000000, 51);

        for (Employees employees : arrayEmployees) {
            if (employees.getAge() > 40) employees.showInfo();
        }
    }
}
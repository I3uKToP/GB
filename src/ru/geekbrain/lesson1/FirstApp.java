package ru.geekbrain.lesson1;

public class FirstApp {

        public static void main(String[] args) {
            /*Создать переменные всех пройденных типов данных, и инициализировать их значения;*/
            byte b = 127; //1
            short sh = 32767; //2
            int i = 10; //3
            long l = 20; //4
            float f = 20.02f; //5
            double d = 10.01; //6
            char c = 'c'; //7
            boolean bool = true; //8



            //3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода;
            System.out.println("Задание №3");
            System.out.println(methodOne(1,20,20,60));

            //4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
            System.out.println("Задание №4");
            methodTwo(10,30);
            //5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.
            System.out.println("Задание №5");
            positiveOrNegative(5);

            //6. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;
            System.out.println("Задание №6");

            bool = negative(10);
            System.out.println(bool);

            //7. Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
            System.out.println("Задание №7");
            printName ("Viktor");

            //8. * Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.

            System.out.println("Задание №8");
            visokisniy(2020);


        }

        //3
        private static float methodOne (int a, int b, int c, int d) {
            float f = a * (b + (c / (float)(d)));
            return f;
        }
        //4
        private static boolean methodTwo (float a, float b) {
            if (a + b >= 10 && a + b <=20 ) {
                float j = a + b;
                System.out.println("Сумма числе a + b = " + j + " и находится в пределах от 10 до 20 (включительно)");
                return true;
            }
            else  {
                float j = a + b;
                System.out.println("Сумма числе a + b = " + j + " и находится вне пределах от 10 до 20 (включительно)");
                return false;
            }
        }
        //5
        private static void positiveOrNegative (int a) {
            if (a >= 0) {
                System.out.println("Число "+a +" положительное");
            }
            else {
                System.out.println("Число "+a +" отрицательное");
            }
        }
        //6 //Помню Ваше пожелание о том что надо в скобки тело заключать, но тут так красиво получилось
        private static boolean negative (int a) {
            if (a < 0) return true;
            else return false;
        }
        //7
        private static void printName (String name) {
            System.out.println("Hello, " + name + " !");
        }
        //8
        private static void visokisniy (int a) {
            if (a%400 ==0) System.out.println(a+" год является високосным");
            else if (a%4==0 && a%100!=0) System.out.println(a+" год является високосным");
            else System.out.println(a+" год НЕ является високосным");
        }
    }


package ru.geekbrain.lesson2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1. Задать целочисленный массив, состоящий из элементов 0 и 1.
        // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        // С помощью цикла и условия заменить 0 на 1, 1 на 0;
        System.out.println("Задание №1");
        int[] arr = new int [] {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        // вывод исходного массива
        for (int i : arr) System.out.print(i + " ");
        // цикл по замене
        for (int i =0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] =0;
            }
            else {
                arr[i] =1;
            }
        }
        // вывод замененного массива
        System.out.println();
        for (int i : arr) System.out.print(i + " ");

        //2. Задать пустой целочисленный массив размером 8.
        // С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        System.out.println("\n Задание №2");
        int[] arr2 = new int[8];
        for (int i : arr2) System.out.print(i + " ");
        for (int i= 1; i <arr2.length; i++) {
            arr2[i] = arr2[i-1] +3 ;
        }
        // вывод замененного массива
        System.out.println();
        for (int i : arr2) System.out.print(i + " ");

        //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
        // пройти по нему циклом, и числа меньшие 6 умножить на 2;
        System.out.println("\n Задание №3");
        int [] arr3 = new int [] { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i : arr3) System.out.print(i + " ");
        for (int i =0; i <arr3.length; i++) {
            if (arr3[i] <6) arr3[i] *=2;
        }
        // вывод замененного массива
        System.out.println();
        for (int i : arr3) System.out.print(i + " ");

        //4. Создать квадратный двумерный целочисленный массив
        // (количество строк и столбцов одинаковое), и с помощью цикла(-ов)
        // заполнить его диагональные элементы единицами;

        System.out.println("\n Задание №4");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер двумерного массива");
        int n = scanner.nextInt();
        int[][] arr4 = new int[n][n];
        for (int i = 0; i <arr4.length; i++) {
            for (int j =0 ; j < arr4[i].length; j++) {
                System.out.print(arr4[i][j]+" ");
            }
            System.out.println();
        }

        for (int i = 0; i <arr4.length; i++) {
            for (int j =0 ; j < arr4[i].length; j++) {
                if (i +j == arr4.length -1 | i == j) {
                    arr4[i][j] =1;
                }
            }
        }
        //Вывод измененного масива
        System.out.println("Измененный массив");
        for (int i = 0; i <arr4.length; i++) {
            for (int j =0 ; j < arr4[i].length; j++) {
                System.out.print(arr4[i][j]+" ");
            }
            System.out.println();
        }

        //5. ** Задать одномерный массив и найти в нем минимальный и
        // максимальный элементы (без помощи интернета);
        //был уже создан массив из 3 задания (arr3)
        System.out.println("\nЗадание №5");
        arr3[3] = -10;
        int min =arr3[0], max =arr3[0];
        for (int i : arr3) System.out.print(i + " ");
        for (int i=0; i <arr3.length; i++) {
            if (arr3[i] > max) max =arr3[i] ;
            if (arr3[i] < min) min = arr3[i];
        }
        System.out.println("\nМаксимальное число в массиве = " + max);
        System.out.println("Минимальное число в массиве = " + min);

        //6. ** Написать метод, в который передается не пустой
        // одномерный целочисленный массив, метод должен вернуть true,
        // если в массиве есть место, в котором сумма левой и правой части массива равны.
        // Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
        // checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||,
        // эти символы в массив не входят.
        System.out.println("Задание №6");
        int[] arr6 = new int[] {2, 2, 2, 1, 2, 2, 10, 1}; // для проверки
        int[] arr6a = new int[] {1, 1, 1, 2, 1}; // для проверки
        summOfLeftandRightSide(arr6);

        //7. **** Написать метод, которому на вход подается одномерный массив и
        // число n (может быть положительным, или отрицательным),
        // при этом метод должен сместить все элементымассива на n позиций.
        // Для усложнения задачи нельзя пользоваться вспомогательными массивами.
        System.out.println("Задание №7\nВведите число на которое надо сдвинуть массив");
        n = scanner.nextInt();
        int[] arr7 = new int[] {2,4,6,8};
        //1 - 8 2 4 6
        //2 - 6 8 2 4

        //3 - 4 6 8 2
        //-1 - 4 6 8 2

        moveElementByN(arr3, n);


    }
    //6
    public static boolean summOfLeftandRightSide (int[] arr) {
        int n = arr.length;
        int summArray =0;
        int buffSum = 0;
        for (int i : arr) {
            summArray += i;
        }
        System.out.println("Сумма всех элементов массива = " + summArray);
        for (int i=0; i < n; i++) {
            buffSum +=arr[i];
            if (buffSum == summArray - buffSum) {
                System.out.println("True");
                System.out.println(i + " Индекс элемента где правая и левая часть равны");
                System.out.println("Сумма левой и правой части = " + buffSum);
                return true;
            }
        }
        System.out.println("false");
        return false;
    }

    //7
    public static void moveElementByN (int[] arr, int n) {
        int l = arr.length;
        int move = 0;
        if (n >=0) {
            if (n < l) move =n;
            else move = n%l;
        }
        else {
            move = Math.abs(l+n) ;
            if (move > l) move = move %l ;
        }
        System.out.println("Исходный массив:");
        for (int i : arr) System.out.print(i + " ");
        System.out.println();
        System.out.println(move+ " на сколько сдвинется вправо");
        for (int i=0; i <  move ; i++) {
            int buffer = arr[0];
            arr[0] = arr[arr.length-1];
            for (int j = 1; j < arr.length - 1; j++) {
                arr[arr.length - j] = arr[arr.length - j - 1];
            }
            arr[1] = buffer;
        }
        System.out.println("Измененный массив:");
        for (int i : arr) System.out.print(i + " ");
    }
}

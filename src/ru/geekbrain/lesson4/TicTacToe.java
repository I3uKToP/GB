package ru.geekbrain.lesson4;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    public static final int SIZE =3;
    public static final char map[][] = new char[SIZE][SIZE];
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static final Scanner SCANNER = new Scanner(System.in);
    public static final int COUNT_TO_WIN = 3;


    public static void main(String[] args) {
        initMap();
        printMap();
        do {
            turnHuman();
            if (checkEndGame(DOT_X)) {
                if(isMapFull()) System.out.println("Ничья");
                else System.out.println("Вы выиграли");
                break;
            }
            turnComputer();
            if (checkEndGame(DOT_O)) {
                if(isMapFull()) System.out.println("Ничья");
                else System.out.println("Победила машина");
                break;
            }
            printMap();
        } while (true);
        printMap();

    }

    private static boolean checkEndGame(char dot) {
        int count = 0;

        // строки
        for (int indexRow = 0; indexRow < map.length; indexRow++) {
            for (int indexCol = 0; indexCol < map.length; indexCol++) {
                if(map[indexRow][indexCol] ==dot) {
                    count++;
//                    System.out.println("Количество строки= " + count);
                 }
                else count =0;
                if (count>=COUNT_TO_WIN) {

                    return true;
                }
            }
            count=0;
        }
        //  столбцы
        for (int indexRow = 0; indexRow < map.length; indexRow++) {
            for (int indexCol = 0; indexCol < map.length; indexCol++) {
                if(map[indexCol][indexRow] ==dot) {
                    count++;
//                    System.out.println("Количество столбцы = " + count + " "+ dot);
                }
                else count =0;
                if (count>=COUNT_TO_WIN) {

                    return true;
                }
            }
            count=0;
        }
        // диагональ центральная
        for (int i = 0; i < map.length; i++) {
            if(map[i][i] ==dot) {
                count++;
//                System.out.println("Количество диагонали = " + count);
            }
            else count =0;
            if (count>=COUNT_TO_WIN) {

                return true;
            }
        }
        // диагональ на 4 верхняя
        for (int i = 0; i < map.length-1; i++) {
            if(map[i][i+1] ==dot) {
                count++;
//                System.out.println("Количество диагонали четыре = " + count);
            }
            else count =0;
            if (count>=COUNT_TO_WIN) {

                return true;
            }
        }
        // диагональ на 4 нижняя
        for (int i = 1; i < map.length; i++) {
            if(map[i][i-1] ==dot) {
                count++;
//                System.out.println("Количество диагонали четыре = " + count);
            }
            else count =0;
            if (count>=COUNT_TO_WIN) {

                return true;
            }
        }

// обратная диагональ центральная
        for (int i = 0; i < map.length; i++) {
            if(map[(SIZE-1)-i][i]==dot) {
                count++;
//                System.out.println("Количество диагональ обратная= " + count + " " + dot);
            }
            else count =0;
            if (count>=COUNT_TO_WIN) {

                return true;
            }
        }
        // обратная диагональ на 4 верхняя
        for (int i = 0; i < map.length-1; i++) {
            if(map[(SIZE-2)-i][i]==dot) {
                count++;
//                System.out.println("Количество диагональ обратная четыре= " + count + " " + dot);
            }
            else count =0;
            if (count>=COUNT_TO_WIN) {

                return true;
            }
        }
        // обратная диагональ на 4 нижняя
        for (int i = 0; i < map.length-1; i++) {
            if(map[(SIZE-1)-i][i+1]==dot) {
                count++;
//                System.out.println("Количество диагональ обратная четыре= " + count + " " + dot);
            }
            else count =0;
            if (count>=COUNT_TO_WIN) {

                return true;
            }
        }


//        if (map[0][0] == dot && map[0][1]==dot && map[0][2]==dot) return true;
//        if (map[1][0] == dot && map[1][1]==dot && map[1][2]==dot) return true;
//        if (map[2][0] == dot && map[2][1]==dot && map[2][2]==dot) return true;
//        //columns
//        if (map[0][0] == dot && map[1][0]==dot && map[2][0]==dot) return true;
//        if (map[0][1] == dot && map[1][1]==dot && map[2][1]==dot) return true;
//        if (map[0][2] == dot && map[1][2]==dot && map[2][2]==dot) return true;
//        //diagonals
//        if (map[0][0] == dot && map[1][1]==dot && map[2][2]==dot) return true;
//        if (map[2][0] == dot && map[1][1]==dot && map[0][2]==dot) return true;
        return false;

    }

    private static boolean isMapFull() {
        for (char[] row : map) {
            for (char c : row) {
                if (c==DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void turnComputer() {
        Random random = new Random();
        int indexRow;
        int indexCol;
        do {
            indexRow = random.nextInt(SIZE);
            indexCol = random.nextInt(SIZE);
        } while(!isInputValidate(indexRow, indexCol));
        map[indexRow][indexCol] = DOT_O;

    }

    private static void turnHuman() {
        int indexRow;
        int indexCol;
        do {
            System.out.println("Введите строку:");
            indexRow = SCANNER.nextInt() -1;
            System.out.println("Введите столбец:");
            indexCol = SCANNER.nextInt() -1;
        } while(!isInputValidate(indexRow, indexCol));
        map[indexRow][indexCol] = DOT_X;
    }



    private static boolean isInputValidate(int indexRow, int indexCol) {
        if ( (indexRow < 0 || indexRow>=SIZE) || (indexCol <0 ||indexCol>=SIZE)) {
            System.out.println("Число строки и столбца должны быть от 0 до " + SIZE);
            return false;
        }
        if (isCellEmpty(indexRow, indexCol)) {
            System.out.println("Данная клетка занята");
            return false;
        }
        return true;
    }

    private static boolean isCellEmpty(int indexRow, int indexCol) {
        if(map[indexRow][indexCol] !=DOT_EMPTY) {
            return true;
        }
        return false;
    }

    private static void printMap() {
        for (int i = 0; i <= map.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int indexRow = 0; indexRow < map.length ; indexRow++) {
            System.out.print((indexRow+1) + " ");
            for (int indexCol = 0; indexCol < map.length ; indexCol++) {
                System.out.print(map[indexRow][indexCol]+ " ");
            }
            System.out.println();
        }

    }

    private static void initMap() {
        for (int indexRow = 0; indexRow < map.length; indexRow++) {
            for (int indexCol = 0; indexCol < map.length; indexCol++) {
                map[indexRow][indexCol] = DOT_EMPTY;
            }
        }
    }

}

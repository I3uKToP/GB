package ru.geekbrain.lesson8;

import java.util.Random;

public class TicTacToe {
    public static final int map[][] = new int[Window.ROW][Window.COL];


    public static void humanStep(String text) {
        String[] arr =text.split(" ");
        int indexRow = Integer.parseInt(arr[0]);
        int indexCol = Integer.parseInt(arr[1]);
        checkStep(indexRow, indexCol);
        stepAI();
        printMap();
    }

    private static void stepAI() {
        Random random = new Random();
        int indexRow;
        int indexCol;
        do {
            indexRow = random.nextInt(Window.ROW);
            indexCol = random.nextInt(Window.COL);
        } while(chekStepAI(indexRow, indexCol));
        map[indexRow][indexCol] = -1;
    }

    private static boolean chekStepAI(int indexRow, int indexCol) {
        if(map[indexRow][indexCol]==0) {
            return false;
        }
        else return true;
    }

    private static void checkStep(int indexRow, int indexCol) {
        if (map[indexRow][indexCol] ==0) {
            map[indexRow][indexCol] =1;
        }
    }


    private static boolean isMapFull() {
        for (int i = 0; i < Window.ROW; i++) {
            for (int j = 0; j < Window.COL; j++) {
                if (map[i][j] != 0) {
                    return false;
                }
            }

        }
        return true;
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

}

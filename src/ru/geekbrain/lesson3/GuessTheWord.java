package ru.geekbrain.lesson3;

import java.util.Scanner;

public class GuessTheWord {
    public static void main(String[] args) {
        String[] words = new String[] {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        int indexRandom = (int)(Math.random()*words.length);
        String guessWord = words[indexRandom];
        System.out.println(words[indexRandom]);
        Scanner scanner = new Scanner(System.in);
        String userWord;
        char[] helpWord = new char[15];
        for (int i=0; i<helpWord.length; i++) {
            helpWord[i] = '#';
        }
        do {
            System.out.println("Введите слово");
            userWord = scanner.nextLine();
            int buff = userWord.length() ;
            if (userWord.length() > guessWord.length()) buff =guessWord.length();
            for (int i =0; i <buff; i++) {
                if (guessWord.charAt(i) == userWord.charAt(i)) {
                    helpWord[i] = guessWord.charAt(i);
                }
            }
            System.out.println(helpWord);
        } while (!words[indexRandom].equals(userWord));

        if (words[indexRandom].equals(userWord)) System.out.println("Вы выиграли");

    }
}

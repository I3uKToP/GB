package ru.geekbrain.lesson7;

public class Main {
    public static void main(String[] args) {
        Plate plate = new Plate(20);
        Cat [] cats = new Cat[5];
        cats[0] = new Cat("Василий", 10);
        cats[1] = new Cat("Мурзик", 8);
        cats[2] = new Cat("Барсик", 11);
        cats[3] = new Cat("Муся", 2);
        cats[4] = new Cat("Кеша", 5);

        for (Cat cat : cats) {
            cat.eat(plate);

        }

        plate.showInfo();
        plate.addFood(15);
        plate.showInfo();


        System.out.println("Part 2 _______String");
        String string = "I like Java!!!";
        System.out.println("Распечатать последний символ строки. Используем метод String.charAt().");
        lastChar(string);
        System.out.println("в) Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем метод String.endsWith()");
        checkLastChar(string);
        System.out.println("г) Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод String.startsWith().");
        checkFistSting(string, "I like ");
        System.out.println("д) Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().");
        checkWord(string, "Java");
        System.out.println("e) Найти позицию подстроки “Java” в строке “I like Java!!!”.");
        System.out.println("Позиция слова Java в строке \"" + string + "\" равняется: " + string.indexOf("Java"));

        System.out.println("ж) Заменить все символы “а” на “о”.");
        System.out.println(string.replace("a", "o"));

        System.out.println("з) Преобразуйте строку к верхнему регистру.");
        System.out.println(string.toUpperCase());

        System.out.println("и) Преобразуйте строку к нижнему регистру.");
        System.out.println(string.toLowerCase());
        System.out.println("Вырезать строку Java c помощью метода String.substring().");
        System.out.println(string.substring(7,11));

    }





    private static void checkWord(String string, String word) {
        if (string.contains(word)) System.out.println("Ваша строка содержит слово \"" + word + "\" ");
        else System.out.println("Ваша строка не содержит слово \" " + word + " \" ");
    }

    private static void checkFistSting(String string, String first) {
        if (string.startsWith(first)) System.out.println("Ваша строка начинается с вашего значения " + first);
        else System.out.println("Ваша строка не  начинается с " + first);
    }

    private static void checkLastChar(String string) {

        if (string.endsWith("!!!")) System.out.println("Ваша строка " + string + " заканчивается \"!!!\" ");
        else System.out.println("Ваша строка " + string + " не заканчивается !!!");
    }

    public static void lastChar(String string) {
        System.out.println(string.charAt(string.length()-1));

    }

}

package ru.bk.pall2006;

import java.util.Scanner;

public class UserInput {
    private AlphabetReader alphabetReader = new AlphabetReader();
    private Gallows gallows = new Gallows();

    private int counter = 0;

    public void guessLetter(StringBuilder sb, String str) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (counter < 6) {
                System.out.println("Назовите любую букву русского алфавита");
                String input = scanner.nextLine().toLowerCase();
                if (input.length() == 1 && alphabetReader.checkLetter(input.charAt(0)) != '\0') {
                    char a = input.charAt(0);
                    boolean found = false;

                    for (int i = 0; i < str.length(); i++) {
                        if (str.charAt(i) == a) {
                            sb.setCharAt(i, a);
                            found = true;
                        }
                    }

                    if (found) {
                        System.out.println("Есть такая буква! Слово сейчас выглядит так:");
                        System.out.println(sb);
                    } else {
                        counter++;
                        gallows.buildGallows(counter);
                        if (counter == 6) {
                            System.out.println("Вы проиграли!!! Все попытки закончились");
                            System.out.println("Правильный ответ - " + str);
                            return;
                        }
                        System.out.println("Неправильно. Попробуйте еще раз.");
                        System.out.println("Осталось : " + (6 - counter) + " попыток");
                        System.out.println(sb);
                    }
                    if (sb.toString().equals(str)) {
                        System.out.println("Поздравляем вы победили!!!");
                        return;
                    }
                } else {
                    System.out.println("Пожайлуста внимательно читайте инструкцию");
                }
            }
        }
    }
}



package ru.bk.pall2006;

import java.util.Scanner;

public class StartGame {
    private UserInput guesser = new UserInput();
    private FileReader fileReader = new FileReader();

    public void startGame() {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("Начать новую игру наберите - \"1\", закончить - \"2\"");
                String number = scanner.nextLine();
                if (number.equals("1")) {
                    String word;
                    try {
                        word = fileReader.randomWord();
                    } catch (Exception e) {
                        System.out.println("Ошибка при получении слова: " + e.getMessage());
                        continue;
                    }
                    StringBuilder maskedWord = new StringBuilder();
                    maskedWord.append("*".repeat(word.length()));
                    System.out.println("Слово, которое нужно угадать. У вас 6 попыток.");
                    System.out.println(maskedWord);
                    guesser.guessLetter(maskedWord, word);
                } else if (number.equals("2")) {
                    System.out.println("До скорых встреч!!!");
                    break;
                } else {
                    System.out.println("Введите корректно данные согласно условию:");
                }
            }
        }
    }
}




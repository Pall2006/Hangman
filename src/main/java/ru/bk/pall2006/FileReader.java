package ru.bk.pall2006;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class FileReader {

    private File file = new File("src/dictionary.txt");

    public String randomWord() {
        try (Scanner scanner = new Scanner(file)) {
            List<String> arraysList = new ArrayList<>(5000);
            while (scanner.hasNextLine()) {
                String word = scanner.nextLine();
                // Добавляем только слова длиной от 5 до 7 символов
                if (word.length() >= 5 && word.length() <= 7) {
                    arraysList.add(word);
                }
            }
            if (arraysList.isEmpty()) {
                throw new RuntimeException("В файле нет слов подходящих требованию.");
            }
            // Выбираем случайное слово из списка
            Random random = new Random();
            return arraysList.get(random.nextInt(arraysList.size()));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

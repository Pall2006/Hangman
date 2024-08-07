package ru.bk.pall2006;

import java.util.ArrayList;
import java.util.List;

public class AlphabetReader {
    public char checkLetter(char input) {
        List<Character> russianAlphabet = new ArrayList<>(40);
        for (char c = 'а'; c <= 'я'; c++) {
            russianAlphabet.add(c);
        }
        russianAlphabet.add('ё');

        if (russianAlphabet.contains(input)) {
            return input;
        } else {
            return '\0';
        }
    }
}


package org.example;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(
                List.of("Casa", "Coche", "Palabra", "Ópera")
        );

        words.stream()
                .filter(word -> normalize(word).contains("o"))
                .forEach(System.out::println);
    }

    private static String normalize(String input) {
        String normalized = Normalizer.normalize(input, Normalizer.Form.NFD);
        return normalized.replaceAll("\\p{M}+", "").toLowerCase(Locale.ROOT);
    }
}

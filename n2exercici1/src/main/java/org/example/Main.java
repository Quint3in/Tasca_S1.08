package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(
                List.of("Maria","Ana","Marcos","Alejandro","Jacinto")
        );

        List<String> mutableWords = words.stream()
                .filter(word -> word.length()==3 && word.startsWith("A"))
                .collect(Collectors.toList());

        mutableWords.forEach(System.out::println);
    }
}

package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(
                List.of("Maria","Ana","Marcos","Alejandro","Jacinto")
        );

        words.stream()
                .filter(word -> word.length()==3 && word.startsWith("A"))
                .forEach(System.out::println);
    }
}

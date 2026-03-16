package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        List<String> words = new ArrayList<>(
                List.of("Maria","Ana","Marcos","Alejandro","Jacinto")
        );

        words.stream()
                .filter(word -> word.length()==3 && word.startsWith("A"))
                .forEach(System.out::println);
    }
}

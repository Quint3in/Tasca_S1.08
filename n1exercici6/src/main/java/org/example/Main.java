package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    static void main() {
        List<String> words = new ArrayList<>(
                List.of("coche","casa","uno","y","no")
        );
        words.stream().sorted(
                Comparator.comparing(String::length)
                )
                .forEach(System.out::println);
    }
}

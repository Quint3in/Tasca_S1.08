package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> words = new ArrayList(
                List.of("valor","espina","43")
        );


        words.sort(
                (s1,s2) -> Character.compare(s1.charAt(0),s2.charAt(0))
        );
        words.sort(
                (s1,s2) -> Boolean.compare(!s1.contains("e"),!s2.contains("e"))
        );
        words.replaceAll( s -> s.contains("a") ? s.replace("a","4") : s);

        words.forEach(System.out::println);

        System.out.println("----------------------");
        words.stream()
                .filter(s -> s.matches("\\d+"))
                .forEach(System.out::println);
    }
}

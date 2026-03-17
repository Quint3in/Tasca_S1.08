package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(
                List.of(33,34,56)
        );

        String result = numbers.stream()
                .map(number -> (number % 2 == 0 ? "e" : "o")+number )
                .collect(Collectors.joining(", "));
        System.out.println(result);
    }
}

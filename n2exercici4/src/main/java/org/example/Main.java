package org.example;

import java.util.ArrayList;
import java.util.List;

import static org.example.WordListProcessor.*;

public class Main {
    public static void main(String[] args) {
        List<String> words = new ArrayList(
                List.of("valor","espina","43")
        );
        System.out.println("Ordenado por primer caracter");
        sortByFirstCharacter(words).forEach(System.out::println);

        System.out.println("Ordenado por palabras que contienen e primero");
        sortByWordsWithE(words).forEach(System.out::println);

        System.out.println("Reemplazar las A por 4");
        replaceAWith4(words).forEach(System.out::println);

        System.out.println("Mostrar solo dígitos númericos");
        filterByDigits(words).forEach(System.out::println);
    }
}

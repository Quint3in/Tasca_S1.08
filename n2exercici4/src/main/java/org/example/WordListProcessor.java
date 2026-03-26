package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class WordListProcessor {

    public static List<String> sortByFirstCharacter(List<String> list){
        List<String> sortedList = new ArrayList<>(list);
        sortedList.sort(
                Comparator.comparingInt(s -> s.charAt(0))
        );
        return sortedList;
    }
    public static List<String> sortByWordsWithE(List<String> list){
        List<String> sortedList = new ArrayList<>(list);
        sortedList.sort(
                (s1,s2) -> Boolean.compare(!s1.contains("e"),!s2.contains("e"))
        );
        return sortedList;
    }
    public static List<String> replaceAWith4(List<String> list){
        List<String> replacedList = new ArrayList<>(list);
        replacedList.replaceAll( s -> s.contains("a") ? s.replace("a","4") : s);
        return replacedList;
    }
    public static List<String> filterByDigits(List<String> list){
        List<String> filteredList = new ArrayList<>(list);
        filteredList = filteredList.stream()
                .filter(s -> s.matches("\\d+"))
                .collect(Collectors.toList());
        return filteredList;
    }

}

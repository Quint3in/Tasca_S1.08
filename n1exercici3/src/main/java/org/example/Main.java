package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> months = new ArrayList<>(
                List.of("Enero", "Febrero", "Marzo",
                        "Abril", "Mayo", "Junio", "Julio",
                        "Agosto", "Septiembre", "Octubre",
                        "Noviembre", "Diciembre"
                )
        );
        months.stream().forEach(month -> System.out.println(month));
    }
}

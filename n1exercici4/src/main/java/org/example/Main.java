package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        List<String> months = new ArrayList<>(
                List.of("Enero", "Febrero", "Marzo",
                        "Abril", "Mayo", "Junio", "Julio",
                        "Agosto", "Septiembre", "Octubre",
                        "Noviembre", "Diciembre"
                )
        );
        months.forEach(System.out::println);
    }
}

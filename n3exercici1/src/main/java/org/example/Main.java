package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Crear otr clase con la lista de estudiantes y crear métodos para cada uno de los filtros
        List<Student> students = new ArrayList<>(
                List.of(
                        new Student("Maria",20,"PHP",10),
                        new Student("Marcos",17,"JAVA",7),
                        new Student("Alejandro",23,"PHP",8),
                        new Student("Javier",22,"PHP",3),
                        new Student("Albert",22,".NET",5),
                        new Student("Ana",19,"JAVA",9),
                        new Student("Lucia",16,"JAVA",6),
                        new Student("Pablo",24,".NET",7),
                        new Student("Sergio",15,"PHP",8),
                        new Student("Carmen",23,"JAVA",5)
                )
        );
        System.out.println("--------------------------------------------------------");
        System.out.println("Students lista:");
        students.forEach(student -> {System.out.println(student.getName()+":"+student.getAge());});

        System.out.println("--------------------------------------------------------");
        System.out.println("Nombre empieza por a:");
        List<Student> aStudents = students.stream()
                .filter(student -> student.getName().toLowerCase().startsWith("a"))
                .toList();

        aStudents.forEach(System.out::println);
        System.out.println("--------------------------------------------------------");
        System.out.println("Nota mayor igual 5:");
        students.stream()
                .filter(student -> student.getGrade()>=5)
                .forEach(System.out::println);

        System.out.println("--------------------------------------------------------");
        System.out.println("Nota mayor igual 5 y no son de PHP:");
        students.stream()
                .filter(student -> student.getGrade()>=5 && !student.getCourse().equalsIgnoreCase("PHP"))
                .forEach(System.out::println);
        System.out.println("--------------------------------------------------------");
        System.out.println("Mayores de edad y son de JAVA");
        students.stream()
                .filter(student -> student.getAge()>=18 && student.getCourse().equalsIgnoreCase("JAVA"))
                .forEach(System.out::println);

    }
}

package org.example;

public class Main {
    static void main() {
        StringReverser reverser = s -> new StringBuilder(s).reverse().toString();
        String original = "Max Verstappen";
        String reversed = reverser.reverse(original);
        System.out.println(reversed);
    }
}

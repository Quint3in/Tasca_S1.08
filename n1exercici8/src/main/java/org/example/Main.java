package org.example;

public class Main {
    public static void main(String[] args) {
        StringReverser reverser = s -> new StringBuilder(s).reverse().toString();
        String original = "Max Verstappen";
        String reversed = reverser.reverse(original);
        System.out.println(reversed);
    }
}

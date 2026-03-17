package org.example;

public class Main {
    static void main() {
        float a = 5.3F;
        float b = 6.5F;
        Operation sum = () -> a + b;
        Operation sub = () -> a - b;
        Operation mult = () -> a * b;
        Operation div = () -> a / b;

        System.out.println(sum.operacio());
        System.out.println(sub.operacio());
        System.out.println(mult.operacio());
        System.out.println(div.operacio());
    }
}

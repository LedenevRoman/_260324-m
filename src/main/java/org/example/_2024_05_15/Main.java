package org.example._2024_05_15;

public class Main {
    public static void main(String[] args) {
        byte byteValue = 1;    // (-128 до 127)  1 байт
        short shortValue = 500; // (-32 768 до 32 767) 2 байт
        int intValue = 2000000; // (-2147483648 до 2147483647) 4 байта
        long longValue = 5000_000_000L; // (-9 * 10^18 до 9  * 10^18) 8 байт

        float floatValue = 123.123f; // (до 7 десятичных цифр) 4 байта
        double doubleValue = 123.123; // (до 16 десятичных цифр) 8 байта

        System.out.println(floatValue);
        System.out.println(doubleValue);
    }
}

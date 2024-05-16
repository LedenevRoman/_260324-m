package org.example._2024_05_15;

public class Main {
    public static void main(String[] args) {
        // примитивные типы данных
        byte byteValue = 1;    // (-128 до 127)  1 байт
        short shortValue = 500; // (-32 768 до 32 767) 2 байт
        int intValue = 2000000; // (-2147483648 до 2147483647) 4 байта
        long longValue = 5000_000_000L; // (-9 * 10^18 до 9  * 10^18) 8 байт

        float floatValue = 123.45678f; // (до 8 десятичных цифр) 4 байта
        double doubleValue = 123.4567812345678; // (до 16 десятичных цифр) 8 байта

        System.out.println(floatValue);
        System.out.println(doubleValue);

        int c = 65;
        char charValue = 's';  // тип данных для символов с использованием значений из Unicode, размер 2 байта
        char charUnicodeX16 = '\u0065';
        char charUnicodeX10 = (char) c;
        System.out.println(charUnicodeX16);

        boolean boolValue1 = true; // тип данных для булевых значений, размер 1 байт
        boolean boolValue2 = false;

        // не примитивные типы данных (ссылочные)
        String stringValue = "Hello world";

        Byte byteObj = 1;
        Short shortObj = 600;
        Integer integerObj = 100000;
        Long longObj = 1_000_000_000L;

        Float floatObj = 15.1234f;
        Double doubleObj = 432.542;

        Character charObj = 'Y';
        Boolean booleanObj = true;

    }
}

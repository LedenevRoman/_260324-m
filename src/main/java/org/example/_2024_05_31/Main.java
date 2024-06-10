package org.example._2024_05_31;

public class Main {
    public static void main(String[] args) {
        if (true) {
        } else {
        }

        int num = 10;
        String string = num % 2 == 0 ? "even" : "odd";

        char value = 'F';

        switch (value) {
            case 'A':
            case 'B':
            case 'C':
                System.out.println("Сдал");
                break;
            case 'D':
            case 'F':
                System.out.println("Не сдал");
                break;
            default:
                System.out.println("Error");
        }
    }
}

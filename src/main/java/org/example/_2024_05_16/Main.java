package org.example._2024_05_16;

public class Main {
    public static void main(String[] args) {
        boolean isRainy = false;
        double a = 2.0;
        int b = 3;

        System.out.println(a == b);

        // операторы сравнения
        // > больше
        // < меньше
        // >= больше или равно
        // <= меньше или равно
        // == равно
        // != не равно

        if (isRainy) {
            System.out.println("Взять зонт");
        }
        System.out.println("Идём на улицу");


        if (a % 2 == 0) {
            System.out.println("четное");
        } else {
            System.out.println("не чётное");
        }


        //используя if-else
        int c = 0;
        if (a % 2 == 0) {
            c = 1;
        } else {
            c = 2;
        }
        System.out.println("c = " + c);

        //используя тернарный оператор
        c = (a % 2 == 0) ? 1 : 2;
        System.out.println("c = " + c);

        //используя тернарный оператор
        String text = (a % 2 == 0) ? "text1" : "text2";
        System.out.println("text = " + text);

        if (a > 10) {
            System.out.println("a > 10");
        } else if (a > 5) {
            System.out.println("a > 5 and a < 10");
        } else if (a > 0) {
            System.out.println("a > 0 and a < 5");
        } else {
            System.out.println("a is negative");
        }

        if (a > 1) {
            System.out.println("условие 1 выполнено");
            if (b > 2) {
                System.out.println("условие 2 выполнено");
            }
        }

        if (a > 1 && b > 2) {
            System.out.println("условие 1 и условие 2 выполняются");
        }


    }
}

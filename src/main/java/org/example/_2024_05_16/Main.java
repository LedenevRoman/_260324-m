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


        // циклы
        //while
        int x = 0;
        while (x <= 10) {
            System.out.println(x);
            x++;  // x = x + 1;  x += 1;
        }

        //for
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }


        int countDown = 10;

        while (countDown >= 0) {
            System.out.println("До старта " + countDown);
            countDown--;
        }
        System.out.println("Поехали");

/*        int d = 0;
        while (true) {
            System.out.println(d);
            if (d == 1000000) {
                break;
            }
            d++;
        }*/

        int count = 11;
        do {
            System.out.println("count = " + count);
            count++;
        } while (count < 11);
    }


}

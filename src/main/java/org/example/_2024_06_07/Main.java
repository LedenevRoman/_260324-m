package org.example._2024_06_07;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
/*        int i = 0;
        while (i < 10) {
            System.out.println("while cycle: " + i);
            i++;
        }

        for (int k = 0; k < 10; k++) {
            System.out.println("for cycle: " + k);
        }

        int j = 0;
        do {
            System.out.println("do while: " + j);
            j++;
        } while (j < 10);

        while (true) {
            System.out.println("endless while: " + i);
            i++;
            if (i == 1000000) {
                break;
            }
        }

        while (i <= 1500000) {
            i++;
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }*/

        Student student1 = new Student("Andrii", 40);
        Student student2 = new Student("Andrii", 40);
        Student student3 = new Student("Mariya", 30);
        Student student4 = new Student("Anton", 35);

        System.out.println(student1.equals(student2));
        System.out.println(student1.hashCode());
        System.out.println(student3.hashCode());
        System.out.println(student1);

        student1.sayHello();

        int[] array1 = new int[5];
        int[] array2 = {5, 2, 3, 1};
        int[] array3 = new int[]{5, 2, 3, 1};

        printArray(array2);
    }

    public static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}

package org.example._2024_05_17;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение переменной myValue: ");
        int myValue = sc.nextInt();
        String s = sc.nextLine();
        char ch = sc.nextLine().charAt(0);

        System.out.println(myValue);
    }
}

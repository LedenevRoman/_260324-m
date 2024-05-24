package org.example._2024_05_24;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("X5", "BMV", 300, "V12");
        Car car4 = new Car("X5", "BMV", 300, "V12");
        Car car2 = new Car("XC70", "Volvo", 200, "V8");
        Car car3 = new Car("A5", "Audi", 250, "V12");

        System.out.println(car1);
        car1.engineName = "V8";
        System.out.println(car1);

        String string1 = "berlin";
        String string2 = string1.replaceAll("b", "B");
        System.out.println(string1);
        System.out.println(string2);
        String string3 = "berlin";

        System.out.println(car1 == car4);

        System.out.println(string1 == string3);

        String string4 = new String("berlin");
        String string5 = new String("berlin");

        System.out.println(string4);
        string4 = string4.replaceAll("b", "B");
        System.out.println(string4);

        System.out.println(string4 == string5);
        System.out.println(string4);

        convertToUpperCase("berlin");
    }

    public static void convertToUpperCase(String string) {
        System.out.println(string.toUpperCase());
    }
}

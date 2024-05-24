package org.example._2024_05_24;

public class VariablesExample {
    public static void main(String[] args) {
        //локальные
/*        String string1 = "hello";
        if (string1 != null) {
            String string2 = "world";
            while (true) {
                System.out.println(string2);
            }
        }*/

        //переменные экземпляра
        Car car1 = new Car("X5", "BMV", 300, "V12");
        Car car4 = new Car("X5", "BMV", 300, "V12");
        Car car2 = new Car("XC70", "Volvo", 200, "V8");

        car1.run();
        car2.run();
        car4.run();

        car1.engineName = "V8";

        //статические переменные
        System.out.println(Car.wheelNumber);
        Car.wheelNumber = 4;
        System.out.println(Car.wheelNumber);
        Car car5 = new Car("XC70", "Volvo", 200, "V8");
        Car car6 = new Car("XC70", "Volvo", 200, "V8");
        System.out.println(Car.wheelNumber);

        System.out.println(Car.carsNumber);
    }

}

package org.example._2024_05_24;

public class Car {
    public String model;
    public String brand;
    public int maxSpeed;
    public String engineName;
    public static int wheelNumber;
    public static int carsNumber;

    public Car(String model, String brand, int maxSpeed, String engineName) {
        this.model = model;
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.engineName = engineName;
        carsNumber++;
    }

/*    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", engineName='" + engineName + '\'' +
                '}';
    }*/


    public void run() {
        System.out.println("Car " + model + " is running");
    }
}

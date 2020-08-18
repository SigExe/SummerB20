package day42_Static;

public class Car {

    String brand;
    String model;
    int year;
    String VIN;
    String color;
    double price;
    static boolean hasWheel;
    static int numberOfWheels = 4;
    static boolean hasEngine;
    static boolean hasDoors;
    static boolean hasBag;
    static boolean hasBelt;

    public void start() {
        System.out.println("Starting " + brand + " " + model + " " + year + " " + VIN + " " + color + " " + price);
    }

    public static void printTires() {
        System.out.println(numberOfWheels + " Tires");
    }

    public String toString() {
        return ("Brand: " + brand + ", Model: " + model + ", Year: " + year + ", Color: " + color +
                "\nNumber of Tires: " + numberOfWheels + "\nHas Engine: " + hasEngine +
                "\nHas Steering Wheel: " + hasWheel + "\nHas Air Bag: " + hasBag);
    }

}

package day39_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class Car {
    /*
    Attributes:
    Model, year, color, brand
     */


    String brand;
    String model;
    int year;
    String color;
    double mileage;
    double price;

    public void setCarInfo(String carBrand, String carModel, int carYear, String carColor,
                       double carMileage, double carPrice){
        brand = carBrand;
        model = carModel;
        year = carYear;
        color = carColor;
        mileage = carMileage;
        price = carPrice;
    }

    public void getCarInfo(){
        System.out.println(year + " " + brand + " " + model + " " + color + " " + mileage + " " + price);
    }


}

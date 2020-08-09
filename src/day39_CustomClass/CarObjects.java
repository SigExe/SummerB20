package day39_CustomClass;

public class CarObjects {

    public static void main(String[] args) {

        Car car1 = new Car();

        /* car1.brand = "Toyota";
        car1.model = "Supra";
        car1.year = 2020;
        car1.color = "Red";
        car1.mileage = 12000;
        car1.price = 80000; */

        car1.setInfo("Toyota", "Supra", 2020, "Red", 9000, 80000);

        System.out.println(car1.brand);
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println(car1.color);
        System.out.println(car1.mileage);
        System.out.println(car1.price);

        System.out.println("========================");

        Car car2 = new Car();

        /* car2.brand = "Mazda";
        car2.model = "Miata";
        car2.year = 2019;
        car2.color = "Wine Red";
        car2.mileage = 9000;
        car2.price = 25000;*/

        car2.setInfo("Mazda", "Miata", 2019, "Wine Red", 12000, 25000);

        System.out.println(car2.brand);
        System.out.println(car2.model);
        System.out.println(car2.year);
        System.out.println(car2.color);
        System.out.println(car2.mileage);
        System.out.println(car2.price);
    }
}

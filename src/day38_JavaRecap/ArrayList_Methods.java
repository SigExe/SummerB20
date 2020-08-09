package day38_JavaRecap;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Methods {

    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<>();
        cars.addAll(Arrays.asList("BMW", "Mercedes", "Inifiti", "Tesla", "WV", "Lamborghini", "Lexus"));
        //                          0         1          2         3       4         5           6

        // cars.remove(3); only removes the object at the index
        // cars.remove("Tesla"); only removes the first matching element
        // cars.removeAll(Arrays.asList("Tesla")); all matching elements
        // cars.removeIf(p -> p.toLowerCase().contains("m")); removes all elements matching with the condition
        // cars.retainAll(Arrays.asList("Tesla")); removes all non-matching elements

        System.out.println(cars);

        System.out.println("===================================");

        ArrayList<String> groceryList = new ArrayList<>();
        groceryList.addAll(Arrays.asList("Eggs", "Milk", "Paper towels", "Toilet paper", "Mango", "Orange", "Avacado",
                "Dragon Fruit"));

        // pepsi
        boolean r1 = groceryList.contains("Pepsi");
        System.out.println(r1);

        // Eggs, Milk, Orange
        boolean r2 = groceryList.containsAll(Arrays.asList("Eggs", "Milk", "Orange", "Water"));
        System.out.println(r2);

        System.out.println("Total number of items: " + groceryList.size());

        // set the dragon fruit to apple
        groceryList.set(groceryList.size() - 1, "Apple");
        groceryList.set(groceryList.indexOf("Paper towels"), "Dishwasher");
        System.out.println(groceryList);

        groceryList.clear();
        System.out.println(groceryList);

    }
}

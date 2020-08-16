package day41_toString;

import java.util.ArrayList;
import java.util.Arrays;

public class catObjects2 {

    public static void main(String[] args) {

        Cat cat1 = new Cat();
        cat1.setInfo("Bobo", 7, 'M', "Orange", "Tiger");
        System.out.println(cat1);

        System.out.println("============================");

        Cat[] catPark = {cat1, new Cat(), new Cat(), new Cat(), new Cat(), new Cat()};

        catPark[1].setInfo("DeWayne", 4, 'F', "Grafetti", "Gang");
        catPark[2].setInfo("DeLante", 2, 'M', "Gold", "Black");
        catPark[3].setInfo("Asha", 8, 'F', "Purple", "Greek");
        catPark[4].setInfo("Isis", 6, 'F', "Green", "Egypt");
        catPark[5].setInfo("Ullr", 3, 'M', "Boba", "Norse");

        ArrayList<Cat> females = new ArrayList<>();
        females.addAll(Arrays.asList(catPark));
        females.removeIf(p -> p.gender == 'M');

        ArrayList<Cat> males = new ArrayList<>();
        males.addAll(Arrays.asList(catPark));
        males.removeAll(females);

        System.out.println("Number of females cats: " + females.size());
        System.out.println("Number of male cates: " + males.size());

    }
}

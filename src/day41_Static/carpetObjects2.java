package day41_Static;

import java.util.ArrayList;
import java.util.Arrays;

public class carpetObjects2 {


    public static void main(String[] args) {

        Carpet[] carpets = {new Carpet(), new Carpet(), new Carpet(), new Carpet(), new Carpet()};

        carpets[0].customOrder(4.5, 3.5, 7.5, false);
        carpets[1].customOrder(5.5, 3.5, 8.5, true);
        carpets[2].customOrder(4.5, 5.5, 9.5, false);
        carpets[3].customOrder(3.5, 4.5, 10.5, true);
        carpets[4].customOrder(6.5, 5.5, 11.5, true);

        ArrayList<Carpet> persian = new ArrayList<>();
        persian.addAll(Arrays.asList(carpets));
        persian.removeIf(p -> !p.isPersian);

        ArrayList<Carpet> regular = new ArrayList<>();
        regular.addAll(Arrays.asList(carpets));
       // regular.removeIf(p -> p.isPersian);
        regular.removeAll(persian);

        System.out.println("Number of Persian carpets: " + persian.size());
        System.out.println("Number of regular carpets: " + regular.size());



    }
}

package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class collectionsUtility {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(30, 20, 56, 78, 98, 100, 20, 0, -1, -2, 400, 500, 4000));

        // Maximum number:
        Integer max = Collections.max(list);

        // Minimum number:
        Integer min = Collections.min(list);

        System.out.println("===================================");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Ramazan", "Islem", "Muhtar", "Saim",
                "Muhtar", "Saim"));
        Collections.replaceAll(names, "Muhtar", "Fatime");

        System.out.println(names);

    }
}

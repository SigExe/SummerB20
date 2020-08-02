package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations_Practice {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();
        students.add("Sayeem");
        students.add("Waqar");
        students.add("Beslen");
        students.add("Dawud");
        students.add("Ramazan");
        students.add("Mehary");

        // verify that the names: Ulku, Busra, are contained in the studesnts list
        boolean b1 = students.containsAll(Arrays.asList("Ulku", "Busra"));
        System.out.println(b1);

        System.out.println("=========================");
        ArrayList<String> group14 = new ArrayList<>();

        // verify all students in your group
        // verify if your mentor and closest friend's name are in the list

        group14.addAll(Arrays.asList("Ali", "Andrii", "Cecil", "Diamante", "Diell", "Elmira",
                "Fatih", "Guljinatt", "Marikayan", "Mehary", "Mike", "Mustafa", "Nurlan",
                "Omer", "Pedrag", "Vlada", "Zeliha"));

        boolean r1 = group14.containsAll(Arrays.asList("Diell", "Nurlan", "Chris"));
        System.out.println(r1);

        System.out.println("=======================");

        ArrayList<String> employeeName = new ArrayList<>();
        employeeName.addAll(Arrays.asList("Ahmed", "Muhtar", "Ahmed", "Virginia",
                "Beslan", "Ibrahim", "Ahmed"));
        employeeName.retainAll(Arrays.asList("Ahmed"));
        System.out.println(employeeName);

    }
}

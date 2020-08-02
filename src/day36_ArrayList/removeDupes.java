package day36_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class removeDupes {

    public static void main(String[] args) {

        ArrayList<Character> list = new ArrayList<>();
        list.addAll(Arrays.asList('A', 'A', 'B', 'B', 'C'));

        System.out.println(list);

        ArrayList<Character> noDupe= new ArrayList<>();

        for(Character each : list){
            if(!noDupe.contains(each)){
                noDupe.add(each);
            }
        }

        System.out.println("========================");

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Cybertek School");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Cybertek");

        System.out.println(list1.equals(list2));

        ArrayList<Integer> list3 = new ArrayList<>();
        System.out.println(list3.isEmpty());
    }
}

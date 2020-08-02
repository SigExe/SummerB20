package day35_ArrayList;

import java.util.ArrayList;

public class ArrayList_Methods {

    public static void main(String[] args) {
        ArrayList<String> earlyBirdList = new ArrayList<>();
        earlyBirdList.add("Ibraham");
        earlyBirdList.add("Virginia");
        earlyBirdList.add("Ziiadin");
        earlyBirdList.add("Erfan");
        earlyBirdList.add("Aalia");

        earlyBirdList.set(2, "Aslan");
        earlyBirdList.set(0, "Ian");

        System.out.println(earlyBirdList);

        earlyBirdList.clear();
        System.out.println(earlyBirdList);
        System.out.println(earlyBirdList.size());

        System.out.println("==============================");

        // remove index
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.remove(2);
        System.out.println(list);

        System.out.println("=====================");

        // remove element
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);

        int a = 1;
        list2.remove(a);
        System.out.println(list2);

        ArrayList<String> list3 = new ArrayList<>();
        list3.add("Hamit");
        list3.add("Liliia");
        list3.add("Bulnet");
        list3.add("Viorel");
        list3.add("Musa");

        // list3.remove(2);
        list3.remove("Bulnet");
        System.out.println(list3);


    }
}

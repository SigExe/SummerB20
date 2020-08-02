package day34_WrapperClass;

import java.util.ArrayList;

public class list_Intro {

    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(95); // autoboxing 0
        scores.add(100);           // 2
        scores.add(85);            // 3
        scores.add(75);            // 4
        scores.add(1, 65); // 1
        scores.add(5, 55);
        System.out.println(scores);
        System.out.println(scores.get(2));

    }


}

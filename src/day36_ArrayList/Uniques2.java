package day36_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Uniques2 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);

        ArrayList<Integer> uniq = new ArrayList<>();

        for(Integer each : list){
            int count = Collections.frequency(list, each);

            if(count == 1){ // verfies the elements frequency and confirms uniqueness
                uniq.add(each);
            }
        }

        System.out.println(uniq);
    }
    }

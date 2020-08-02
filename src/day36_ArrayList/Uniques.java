package day36_ArrayList;

/*
 write a program that can find the unique elements from an ArrayList of integers
 and stores into another list called uniques
            ex: list==> {1,1,2,3,3,4,5}
                uniques ==> {2,4,5}

 */

import java.util.ArrayList;

public class Uniques {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);

        ArrayList<Integer> uniq = new ArrayList<>();

       for(Integer element : list){
           int count = 0;

           for (Integer each : list) {
               if (each == element) { // finds the frequency of each element
                   count++;
               }

           }

           if(count == 1){ // verfies the elements frequency and confirms uniqueness
               uniq.add(element);
           }
       }

        System.out.println(uniq);
    }

}

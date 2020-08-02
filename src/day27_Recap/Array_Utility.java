package day27_Recap;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Array_Utility {

    public static void main(String[] args) {

        String[] names = {"Odina", "Lilia", "Berk", "Emine"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        int[] score = {80, 65, 75, 110, 90, 45, 56, 78};
        Arrays.sort(score);
        System.out.println(Arrays.toString(score));

        System.out.println("Maximum: " + score[score.length -1]);
        System.out.println("Minimum: " + score[0]);

        System.out.println("===================================");

        String[] s1 = {"A", "B", "C"};
        String[] s2 = {"A", "B", "C"};
        System.out.println(Arrays.equals(s1,s2));

        String[] s3 = {"C", "A", "B"};
        System.out.println(Arrays.equals(s1, s3)); // false

        String[] a1 = {"A", "B", "C"};
        String[] a2 = {"A", "B", "C"};

        Arrays.sort(a1);
        Arrays.sort(a2);
        System.out.println(Arrays.equals(a1,a2));

        String w1 = Arrays.toString(a1);



    }




}

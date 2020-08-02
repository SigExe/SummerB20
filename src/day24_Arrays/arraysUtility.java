package day24_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class arraysUtility {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(Arrays.toString(arr));

        String s1 = Arrays.toString(arr);
        System.out.println(s1);

        String[] names = {"Ali", "Suhla", "Arife", "Reyhan", "Mehdi"};
        System.out.println(Arrays.toString(names));

        System.out.println("==================================");

        int[] num = {5, 4, 6, 5, 4, 3, 10};
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));

        System.out.println("Maximum number is: " + num[num.length - 1]);
        System.out.println("Minimum number is: " + num[0]);

        String[] students = {"Medhi", "Elkem", "Meee", "Trump"};
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

        System.out.println("====================");

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        boolean r1 = Arrays.equals(arr1,arr2);
        System.out.println(r1);

        int[] arr3 = {2, 1, 3};
        Arrays.sort(arr2);
        Arrays.sort(arr3);
        boolean r2 = Arrays.equals(arr3,arr2);
        System.out.println(r2);

        int[] arr4 = {1, 1, 2, 3};
        int[] arr5 = {1, 2, 3};

        boolean r3 = Arrays.equals(arr4,arr5);
        System.out.println(r3);




    }



}

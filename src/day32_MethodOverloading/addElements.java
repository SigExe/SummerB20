package day32_MethodOverloading;

import java.util.Arrays;

public class addElements {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int num = 10;

        int[] arr2 = new int[arr.length + 1];
        arr2[arr2.length - 1] = num;

        int i = 0;
        for(int each : arr){
            arr2[i] = each;
            i++;
        }

        System.out.println(Arrays.toString(arr2));

        System.out.println("================================");

        int[] scores = {85, 65, 45, 55, 95};
        int n1 = 87;

        int[] scores2 = addEle(scores, n1);
        Arrays.sort(scores2);
        System.out.println(Arrays.toString(scores2));


    }

    public static int[] addEle(int[] arr, int num){
        int[] arr2 = new int[arr.length + 1];
        arr2[arr2.length - 1] = num;

        int i = 0;
        for(int each : arr){
            arr2[i] = each;
            i++;
        }

        return arr2;
    }
}

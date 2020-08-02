package day26_MultiDimensionalArray;

import java.util.Arrays;

public class sortDescending {

    public static void main(String[] args) {

        int[] arr = {10, 11, 9 , 18 ,12, 15, 20};
        Arrays.sort(arr); // arr: {1, 2, 3}
        System.out.println(Arrays.toString(arr));
        int[] desc = new int [arr.length];

        /* desc[0] = arr[2];
        desc[1] = arr[1];
        desc[2] = arr[0]; */

        int k = arr.length - 1;
        for(int i = 0; i <= desc.length - 1; i++){ // i: 1, 2, 3
            desc[i] = arr[k];
            k--; // k: 2, 1, 0
        }

        System.out.println(Arrays.toString(desc));





    }


}

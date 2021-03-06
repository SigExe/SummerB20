package day27_Recap;

public class forEachLoop {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        for(int i = 0; i <= arr.length - 1; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println("===================================");

        for( int each : arr){
            System.out.print(each + " ");
        }

        System.out.println();
        System.out.println("====================================");

        for(int i = arr.length - 1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println("=====================================");

        int[] scores = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110};

        for(int each : scores){
            if(each % 3 != 0){
                continue;
            }
            System.out.print(each);
        }

        System.out.println();
        System.out.println("========================================");

        String[] names = {"AB", "ABC", "A", "AB", "ABCD"};

        for(String each : names){
            if(!each.contains("C")){
                continue;
            }
            System.out.print(each + " ");
        }

        System.out.println();
        System.out.println("==============================");

        int[] score = {80, 65, 75, 110, 90, 45, 56, 78};

        int max = score[0];
        int min = score[0];

        for(int each : score){
            if(each > max){
                max = each;
            }
            if(each < min){
                min = each;
            }
        }



        System.out.println("Maximum number is: " + max);
        System.out.println("Minimum number is: " + min);




    }



}

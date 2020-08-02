package day34_WrapperClass;

import java.util.ArrayList;

public class list_Practice2 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(30);
        list.add(410);
        list.add(310);
        list.add(210);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(Integer each : list){

            if(each > max){
                max = each;
            }

            if(each < min){
                min = each;
            }
        }
        System.out.println("Max is: " + max);
        System.out.println("Min is: " + min);


    }

}

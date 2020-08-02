package day12_Switch_Scanner;

public class BiggerNumber {
    public static void main(String[] args) {
            double n1 = 100;
            double n2 = 200;
            double n3 = 300;
            boolean n1Bigger = n1 > n2 && n1 > n3;
            boolean n2Bigger = !n1Bigger && n2 > n3;
            String result = "";

            if(n1Bigger){
                result = n1 + " is bigger";
            } else if(n2Bigger){
                result = n2 + " is bigger";
            } else{
                result = n3 + " is bigger";
            }

            String result2 = n1Bigger ? n1 + " is bigger" : n2Bigger ? n2 + " is bigger"
                            : n3 + " is bigger";

        System.out.println(result2);




    }



}

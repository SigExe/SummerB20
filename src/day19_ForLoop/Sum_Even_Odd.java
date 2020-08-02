package day19_ForLoop;

public class Sum_Even_Odd {

    public static void main(String[] args) {

        int sumEven = 0;

        for(int i = 0; i <= 100; i++){
            if(i % 2 == 0){
                sumEven += i;
            }
        }

        System.out.println(sumEven);

        int sumOdd = 0;

        for(int i = 0; i <= 100; i++){
            if(i % 2 != 0){
                sumOdd += i;
            }
        }

        System.out.println(sumOdd);



    }



}

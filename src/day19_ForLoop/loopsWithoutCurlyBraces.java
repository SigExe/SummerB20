package day19_ForLoop;

public class loopsWithoutCurlyBraces {

    public static void main(String[] args) {

        for(int i = 5; i < 10; i++ ){
            System.out.println("Hello");
            System.out.println("How are you");
        }

        System.out.println();

        for(int i = 5; i < 10; i++)
            System.out.println("Hello");
            System.out.println("How are you");



    }


}

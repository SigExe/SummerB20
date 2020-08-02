package day21_Loops;

public class DivideTwoNumbers {

    public static void main(String[] args) {
        int a = 20;
        int b = 6;

        if(b == 0){
            System.out.println("Invalid input");
            System.exit(0);
        }

        int count = 0;

        while(a >= b){

            a -= b;
            count++;
        }

        System.out.println(count + " with a remainder of " + a);



    }



}

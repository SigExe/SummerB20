package day19_ForLoop;

/*
write a program that can print all the ODD numbers between 0 ~ 100
that can be divisible by 3 & 5

write a program that can print all the EVEN numbers between 0 ~ 100
     that can be divisible by 3 & 5

 */

public class Odd_Even {
    public static void main(String[] args) {

        for (int i = 1; i <= 99; i += 2)
        {

            if (i % 5 == 0 && i % 3 == 0) {
                System.out.print(i + " ");
            }

        }

        System.out.println();

        for(int i = 0; i <= 100; i++)
            if(i % 2 != 0)
                if (i % 5 == 0 && i % 3 == 0)
            {
            System.out.print(i + " ");
        }

        System.out.println();

        for(int i = 0; 1 <= 100; i += 2){
            System.out.print(i + " ");
        }



    }

}

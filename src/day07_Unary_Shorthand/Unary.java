package day07_Unary_Shorthand;

public class Unary {
    public static void main(String[] args) {
        System.out.println(-1 - 10);
        System.out.println(-11 + 10);

        // --
        int a = 20;
        // a = a - 1; // 19
            --a;
        System.out.println(a);

        //++
        int b =10;
        // b = b + 1; // b = 11;
        ++b;
        System.out.println(b);

        int x =100;
        System.out.println(++x);

        int y = 200;
        System.out.println(--y);

        int z = 80;
        System.out.println(++z);
        System.out.println(--z);





    }



}

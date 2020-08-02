package day07_Unary_Shorthand;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;

public class Post_Vs_Pre {

    public static void main(String[] args) {
       int a = 10;
        System.out.println(++a); // 11
        System.out.println(a); // 11

        System.out.println("===============================");

        int b = 10;
        System.out.println(b++);
        System.out.println(b);

        System.out.println("==============================");

        int c = 25;
        int d =c++; // d = 25
        //  c = 26
        System.out.println(c);
        System.out.println(d);

        System.out.println("===============================");

        int e = 25;
        e++;
        System.out.println(e);

        System.out.println("=================================");

        int x = 8;
        int y = x--; // y = 8
        System.out.println(y);
        System.out.println(x); // 7

        System.out.println("=================================");

        int v = 50;
        v = --v + v++ + v-- + v++;
      //v = 49  + 49   + 50  + 49
      //v = 197
        System.out.println(v);

        System.out.println("==================================");

        int A = 1; // A = 0
        A = -A-- + A++ / -A-- * --A;
     // A = -1   + 0   / -1   *  -1
     // A = -1 + 0 * -1
     // A = -1 + 0 = -1
        System.out.println(A);

        System.out.println("====================================");

        int p = 4;
        int q = p * 4 - p++;
        //  q = 4 * 4 - 4
        // 16 - 4
        // 12
        System.out.println(q);





    }



}

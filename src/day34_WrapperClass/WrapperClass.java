package day34_WrapperClass;

import java.util.Arrays;

public class WrapperClass {

    public static void main(String[] args) {
        Integer num = 100;
        int num2 = 100;
        byte t = 100;
        int z = t;

        Byte b1 = 50;
        int n1 = b1;

        byte b2 = 40;
        // Integer n2 = b2; error

        Integer n3 = new Integer(123);

        Integer[] arr = new Integer[3];
        System.out.println(Arrays.toString(arr));

        int p1 = 300;
        Integer p2 = p1; // Autoboxing
        Integer q1 = 500;
        int q2 = q1; // Unboxing

        Double r1 = 300.0; // compile error with integer(300), 'Double' only takes decimal(300.0)
        double r2 = r1; // unboxing

        long l1 = 400;
        Long l2 = l1;

        Float f1 = 100.5f;
        Float f2 = f1;




    }
}

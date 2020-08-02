package day32_MethodOverloading;

public class methodOverloading2 {

    public static void main(String[] args) {

        add2(10, 8);
        add3(5, 7, 6);
        add4(5, 8, 4, 6);

        System.out.println("============================");

        addition(10,8);
        addition(5,7,6);
        addition(5,8,4,6);

    }

    public static void add2(double a, double b){
        System.out.println(a + b);
    }

    public static void add3(double a, double b, double c){
        System.out.println(a + b + c);
    }

    public static void add4(double a, double b, double c, double d){
        System.out.println(a + b + c + d);
    }

    public static void addition(double a, double b){
        System.out.println(a + b);
    }

    public static void addition(double a, double b, double c){
        System.out.println(a + b + c);
    }

    public static void addition(double a, double b, double c, double d){
        System.out.println(a + b + c + d);
    }

}

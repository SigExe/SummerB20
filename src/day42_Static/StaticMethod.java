package day42_Static;

public class StaticMethod {



        int a = 200;
        static int b = 400;

    public static void main(String[] args) {
        System.out.println(b);
        // System.out.println(a);

        StaticMethod obj = new StaticMethod();
        System.out.println(obj.a);

        staticMethod();

        obj.instanceMethod();

    }


    public static void staticMethod() {

    }

    public void instanceMethod(){

    }
}

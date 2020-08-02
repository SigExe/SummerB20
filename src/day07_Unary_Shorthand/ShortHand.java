package day07_Unary_Shorthand;

public class ShortHand {
    public static void main(String[] args) {
        int a = 100;
      // a = a * a;
        a *= a;
        System.out.println(a);

        int b = 2;
        b *= 3;
        System.out.println(b);

        int c = 300;
        c -= 100;
        System.out.println(c);

        System.out.println("==============================");

        // +=;
            int z = 300;
            z += 200;
        System.out.println(z);

        String school = "Cybertek";
        school += " School";
        System.out.println(school);

        String fullName = "Sergio";
        fullName += " Ivan Garcia";
        System.out.println(fullName);

        int budget = 100000;
        budget /= 4;
        System.out.println(budget);

        int num = 100;
        num %= 3;
        System.out.println(num);

        double num2 = 400.2;
        num2 %= 2;
        System.out.println(num2);



    }



}

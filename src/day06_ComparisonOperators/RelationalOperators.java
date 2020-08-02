package day06_ComparisonOperators;

public class RelationalOperators {
    public static void main(String[] args) {
        boolean r1 = 10>9;
        System.out.println(r1);

        boolean r2 = 100 < 9000;
        System.out.println(r2);

        // >=
        boolean r3 = 87 >= 85;
        System.out.println(r3);

        boolean r4 = 877 >= 878;
        System.out.println(r4);

        // <=
        boolean r5 = 200 <= 300;
        System.out.println(r5);

        //==: equal
        boolean r6 = 900 == 800;
        System.out.println(r6);

        boolean r7 = true == false;
        System.out.println(r7);

        boolean r8 = "Muhtar" == "Muhtar";
        System.out.println(r8);

        boolean r9 = "muhtar" == "MUHTAR";
        System.out.println(r9);

        // !=
        boolean r10 = "Muhtar" != "Bady Guy";
        System.out.println(r10);

        boolean r11 = true != false;
        System.out.println(r11);

        boolean result1 = 'A' == 65;
        System.out.println(result1);

        boolean result2 = 100 == 100.0;
        System.out.println(result2);

        int number = 100;
        boolean even = number%2 == 0;
        boolean odd = number%2 != 0;

        System.out.println(even);
        System.out.println(odd);

        int x = 1000;
        boolean even2 = x%3 == 0;
        boolean even3 = x%5 == 0;
        boolean even4 = x%10 == 0;
        System.out.println(even2);
        System.out.println(even3);
        System.out.println(even4);





    }



}

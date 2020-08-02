package day11_NestedIf_Ternary;

public class Teranry {
    public static void main(String[] args) {
        int num = 100;
        String result = "";

       String result2 = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(result2);

        System.out.println("================================");

        int num1 = 10;
        int num2 = 20;
        int max1 = 0;

        if(num1 > num2){
            max1 = num1;
        } else{
            max1 = num2;
        }

        System.out.println(max1);

        int max2 = (num1 > num2) ? num1 : num2;
        System.out.println(max2);

        System.out.println("====================================");

        int age = 27;
        boolean eligible = false;
        String citizen = "French";

        String eligible3 = (age >= 21 && citizen == "USA") ? "Can vote" : "Cannot vote";
        System.out.println(eligible3);

        System.out.println("=======================================");

        int n1 = 100;
        int n2 = 200;
        String r = (n1 == n2) ? "Equal" : "Not Equal";
        System.out.println(r);



    }



}

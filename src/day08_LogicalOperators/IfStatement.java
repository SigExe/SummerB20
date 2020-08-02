package day08_LogicalOperators;

public class IfStatement {

    public static void main(String[] args) {
        int a = 2000;
        int b = 2000;

        if (a > b) {
            System.out.println(a + " is the max number");
        }

        if (b > a) {
            System.out.println(b + " is the max number");

        }

        if(a == b) {

            System.out.println("Both are equal");
        }

        System.out.println("===================================");

        boolean breakTime = false;

        if(breakTime == true){
            System.out.println("Take 15 minutes break");
        }

        if(breakTime == false){
            System.out.println("Keep studying");
        }

        System.out.println("==================================");

        boolean corona = true;
        if(corona == true){
            System.out.println("Buy more toilet paper");
            System.out.println("Buy more hand sanitizer");
            System.out.println("Social Distance");
            System.out.println("Stay at Home");

        }

    }

}

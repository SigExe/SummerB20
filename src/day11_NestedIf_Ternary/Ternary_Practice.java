package day11_NestedIf_Ternary;

public class Ternary_Practice {
    public static void main(String[] args) {
        int num = 100;
        String result = "";

        if(num > 0){
            result = "Positive";
        } else if(num < 0){
            result = "Negative";
        } else{
            result = "Zero";
        }

        System.out.println(result);

        String result2 = (num > 0) ? "Positive" : (num < 0) ? "Negative" : "Zero";
        System.out.println(result2);

        System.out.println("========================================");
        int a = 10;
        int b = 20;
        String r = (a > b) ? "a is bigger" : (b > a) ? "b is greater" : " a is equal to be";
        System.out.println(r);



    }


}

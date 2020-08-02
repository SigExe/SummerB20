package day08_LogicalOperators;

public class Post_Pre {

    public static void main(String[] args) {
        int a = 200;
        int b = -a++ + - --a * a-- % 2;
        //  b = -200 + (-200) * 200 % 2;
        //  b = -200 + (-200) * 0
        //  b = -200
        System.out.println(b);

        int x = 300;
        int y = 400;
        int z = x + y - x * y + x / y;
        //  z = 300 + 400 - 120_000 + 0.75
        //  z = -199_300, the data type is int so 0.75 becomes 0
        System.out.println(z);



    }

}

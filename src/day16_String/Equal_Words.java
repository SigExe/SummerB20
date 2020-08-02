package day16_String;

import java.util.Scanner;

public class Equal_Words {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first word: ");
        String word1 = scan.next();

        System.out.println("Enter second word");
        String word2 = scan.next();

        String result = word1.equals(word2) ? "equal" : "Not Equal";

        System.out.println(result);



    }





}

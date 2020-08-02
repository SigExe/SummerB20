package day19_ForLoop;

import java.util.Scanner;

public class palindromeTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        String reverseStr = "";

        for(int i = str.length() - 1; i >= 0; i--){
            reverseStr += str.charAt(i);
        }

        System.out.println(reverseStr);

        System.out.println(str.equalsIgnoreCase(reverseStr));


    }



}

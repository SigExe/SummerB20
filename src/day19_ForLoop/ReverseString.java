package day19_ForLoop;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        /* str = "" + str.charAt(str.length() - 1) + str.charAt(3) + str.charAt(2) +
        str.charAt(1) + str.charAt(0);

        System.out.println(str); */

        String result = "";

        for(int i = str.length() - 1; i >= 0; i--){
            result += str.charAt(i);
        }

        System.out.print(result);


    }



}

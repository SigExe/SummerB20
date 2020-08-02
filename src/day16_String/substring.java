package day16_String;

/*
Ask user to enter two words. Print first word without its first character then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana

 */

import java.util.Scanner;

public class substring {
    public static void main(String[] args) {
        String l = "I like to drink Pepsi";
        String p = l.substring(16,21);
        System.out.println(p);
        String action = l.substring(10,15);
        System.out.println(action);

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter first String: ");
            String a = scan.next();

        System.out.println("Enter the second String");
        String b = scan.next();

        String c = a.substring(1).concat(b.substring(1));
        System.out.println(c);

    }



}

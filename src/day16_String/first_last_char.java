package day16_String;

/*
 Ask user to enter a word. Print true is the first and last characters of the string are same characters, print false otherwise.
            Input:
                abba
            Output:
                true

 */

import java.util.Scanner;

public class first_last_char {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first word");
        String word = scan.next();
        scan.close();

        char char1 = word.charAt(0);
        char char2 = word.charAt(word.length() - 1);
        // System.out.println(char1 == char2);

        if(char1 == char2){
            System.out.println("true");
        } else{
            System.out.println("false");
        }


    }




}

package day19_ForLoop;

/*
Write a program that will print out all letters
in English alphabet in ascending order

Write a program that will print out all letters
in English alphabet in descending order
 */

public class Characters {


    public static void main(String[] args) {

        for(char ch = 'a'; ch <= 'z'; ch++){
            System.out.print(ch + " ");
        }

        System.out.println();

        for(int i = 97; i <= 122; i ++){
            System.out.print((char)i + " ");
        }

        System.out.println();

        for(char ch = 'A'; ch <= 'Z'; ch++){
            System.out.print(ch + " ");
        }

        System.out.println();

        for(int i = 65; i <= 90; i++){
            System.out.print((char)i + " ");
        }

        System.out.println();

        for(char ch = 'z'; ch >= 'a'; ch--){
            System.out.print(ch + " ");
        }

        System.out.println();

        for(int i = 122; i >= 97; i --){
            System.out.print((char)i + " ");
        }

        System.out.println();

        for(char ch = 'Z'; ch >= 'A'; ch--){
            System.out.print(ch + " ");
        }

        System.out.println();

        for(int i = 90; i >= 65; i--){
            System.out.print((char)i + " ");
        }




    }



}

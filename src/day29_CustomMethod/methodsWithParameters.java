package day29_CustomMethod;

import java.util.Scanner;

public class methodsWithParameters {


    public static void main(String[] args) {

        printHello(5);

        System.out.println("================================");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter birth year and current year");
        /* int birthYear = scan.nextInt();
        int currentYear = scan.nextInt(); */

        age(scan.nextInt(), scan.nextInt());


    }



    public static void printHello(int numberOfTimes){

        for( int i = 0; i < numberOfTimes; i ++){
            System.out.print("Hello World" + " ");
        }

        System.out.println();



    }

    public static void age(int birthYear, int currentYear){

        if(currentYear - birthYear < 0){
            System.out.println("Invalid Entry");
            System.exit(0);
        } else{
            int age = currentYear - birthYear;
            System.out.println("You are " + age + " years old");
        }


    }



}

package day20_whileLoop;

import java.util.Scanner;

public class whileLoops_Practice {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for(int i = 1; i <= 10; i++){
            System.out.print(i + " ");
        }

        System.out.println();

        int num = 1;
        while(num <= 10){
            System.out.print(num + " ");
            num++;
        }

        System.out.println();


        int num2 = 1;
        while(num2 <= 10){
            System.out.print("Sergio Garcia" + " ");

            num2++;
        }

        System.out.println();

        String s = "Joanna";
        int i = s.length() - 1;
        String result = "";

        while(i >= 0){


            result += s.charAt(i);

            i--;
        }
        System.out.print(result);

        System.out.println();

        String pass = "SigGod";
        System.out.println("Enter your password: ");
        String input = scan.nextLine();

        while(!input.equals(pass)){
            System.out.println("Please re-enter your password");
            input = scan.nextLine();
        }
        System.out.println("Logged in");








    }



}

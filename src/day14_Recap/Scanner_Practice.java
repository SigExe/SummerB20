package day14_Recap;

/*
task:
1. gender (next() )
2. age (nextInt())
3. country name  ( nextLine() )
4. zipcode  ( nextInt()  )
5. full name (nextLine() )
6. full company name ( nextLine() )
 */

import java.util.Scanner;

public class Scanner_Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your gender: ");
        String gender = input.next();

        System.out.println("Enter your age: ");
        int age = input.nextInt();

        input.nextLine();

        System.out.println("Enter your country name: ");
        String home = input.nextLine();

        System.out.println("Enter your zip code: ");
        int zip = input.nextInt();

        input.nextLine();

        System.out.println("Enter your full name");
        String name = input.nextLine();

        System.out.println("Enter your company name: ");
        String company = input.nextLine();

        System.out.println();




    }




}

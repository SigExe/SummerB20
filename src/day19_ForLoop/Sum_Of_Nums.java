package day19_ForLoop;

/*
write a program that can calculate the sum of all numbers between 1 to any given number
        ex:
            input: 100
            output: 5050
            input: 50
            output: 1275

 */

import java.util.Scanner;

public class Sum_Of_Nums {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = input.nextInt();

        int sum = 0;

        if(num > 1){
            for(int i = 1; i <= num; i++ ){
                sum += i;
            }
            System.out.println(sum);

        } else{
            System.out.println("Invalid number");
        }





    }





}

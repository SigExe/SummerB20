package day16_String;

import java.util.Scanner;

/*
write a program to ask the user enter two number and a math operator.
        ex:
            10
            20
            *
        output:
            200
            10
            2
            /
        output:
            5
    valid math operators are: *, / , +, -, %
    Nested If
 */

public class Math_Shit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        double num1 = scan.nextDouble();

        System.out.println("Enter your second number: ");
        double num2 = scan.nextDouble();

        System.out.println("Enter your math operator");
        char op = scan.next().charAt(0);

        boolean opGood = op == '+' || op == '-' || op == '/' || op == '*' || op == '%';

        if(opGood){
            switch(op){
                case('*'):
                    System.out.println(num1 * num2);
                    break;

                case('/'):
                    System.out.println(num1 / num2);
                    break;

                case('+'):
                    System.out.println(num1 + num2);

                case('-'):
                    System.out.println(num1 - num2);
                    break;

                default:
                    System.out.println(num1 % num2);
            }
        }else{
            System.out.println("Invalid operator");
        }





    }





}

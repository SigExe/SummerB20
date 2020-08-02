package day32_MethodOverloading;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double num1 = scan.nextDouble();
        System.out.println("Enter your Operator: ");
        char op = scan.next().charAt(0);
        System.out.println("Enter second number: ");
        double num2 = scan.nextDouble();

        double result = calc(num1, op, num2);
        System.out.println("Your result is: " + result);



    }

    public static double calc(double num1, char op, double num2){
        double result = (op == '+') ? num1 + num2 : (op == '-') ? num1 - num2:
                (op == '*') ? num1 * num2: (op == '/') ? num1 / num2:
                        (op == '%') ? num1 % num2: 0;
        return result;
    }

}

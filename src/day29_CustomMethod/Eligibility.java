package day29_CustomMethod;

/*
age, citizen, name
 */

public class Eligibility {


    public static void Alcohol(boolean hasID, int age){

        if(hasID && age >= 21){
            System.out.println("You are eligible to buy alcohol");
        } else{
            System.out.println("You are eligible to buy juice");
        }


    }

    public static void main(String[] args) {

        vote("Sergio", 22, true, "Mohammad");

        vote("Booba", 17, true, "Yahweh");

        Alcohol(true, 19);

        calculator(10, '/', 3.0);


    }

    public static void vote(String name, int age, boolean citizen, String candidate){

        boolean eligibleToVote = age >= 18 && citizen == true;
        if(eligibleToVote){
            System.out.println(name + " is eligible to vote for " + candidate);
        } else{
            System.out.println(name + " is not eligible to vote");
        }

    }

    public static void calculator(double num1, char operator, double num2){

        switch (operator){
            case '+':
                System.out.println("Addition: " + (num1 + num2));
                        break;
            case '-':
                System.out.println("Subtraction: " + (num1 - num2));
                break;

            case '*':
                System.out.println("Multiplication: " + (num1 * num2));
                break;

            case '/':
                System.out.println("Division: " + (num1 / num2));
                break;

            case '%':
                System.out.println("Remainder: " + (num1 % num2));
                break;

            default:
                System.out.println("Invalid operator");
        }


    }



}

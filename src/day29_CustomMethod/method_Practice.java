package day29_CustomMethod;

/*
task:
    1. create a method that can print odd numbers between 1~100
    2. create a method that can print even numbers between 1~100

 */

public class method_Practice {


    public static void main(String[] args) {

        oddNum();
        System.out.println("Hello");

        evenNum();
        System.out.println("Hello");

    }

    public static void oddNum(){

        for(int i = 1; i <= 100; i+=2){
            System.out.print(i + " ");
            }

        System.out.println();
        }


    public static void evenNum(){

        for(int i = 0; i <= 100; i +=2){
            System.out.print(i + " ");
        }

        System.out.println();

    }

}

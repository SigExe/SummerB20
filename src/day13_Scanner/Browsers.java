package day13_Scanner;

/*
write a program that can display the selected browser
            1.1  declare a String variable called browserName
            1.2  Assume that the valid browsers are: chrome, firefox, opera, safari, edge
            1.3. if the browser name does not match with the valid browsers' names,
                    out put should be: Invalid Browser Name
 */
public class Browsers {
    public static void main(String[] args) {
        String browserName = "firefox";

        switch(browserName){

            default:
                System.out.println("Invalid Browser Name");
                break;

            case "chrome":
                System.out.println("Opening Chrome Browser");
                break;

            case "firefox":
                System.out.println("Opening FireFox Browser");
                break;

            case "opera":
                System.out.println("Opening Opera Browser");

            case "safari":
                System.out.println("Opening Safari Browser");
                break;


        }




    }




}

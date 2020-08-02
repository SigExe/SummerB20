package day12_Switch_Scanner;

public class Switch_Practice1 {
    public static void main(String[] args) {
        int num = 1;
        String day = "";

        switch(num){

            case 5:
                day = "Friday";
                break;

            case 1:
                day = "Monday";
                break;

            case 3:
                day = "Wednesday";
                break;

            case 4:
                day = "Thursday";
                break;

            case 2:
                day = "Tuesday";
                break;

            case 6:
                day = "Saturday";
                break;

            case 7:
                day = "Sunday";
                break;

            default:
                day = "Invalid Day";

        }

        System.out.println(day);




    }


}

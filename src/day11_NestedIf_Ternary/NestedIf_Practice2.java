package day11_NestedIf_Ternary;

public class NestedIf_Practice2 {
    public static void main(String[] args) {
        int day = 7;
        boolean valid = day >= 1 && day <= 7;
        String result = "";

        if (valid){
            result = day == 1 ? "Monday" : day == 2 ? "Tuesday" : day == 3 ? "Wednesday"
                    : day == 4 ? "Thursday" : day == 5 ? "Friday" : day == 6 ? "Saturday"
                    : "Sunday";

        }else {
            result = "Invalid";
        }

            System.out.println(result);


        }

    }

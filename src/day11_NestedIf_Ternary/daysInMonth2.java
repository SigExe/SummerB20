package day11_NestedIf_Ternary;

public class daysInMonth2 {
    public static void main(String[] args) {
        int month = 12;
        boolean valid = month >= 1 && month <= 12;
        boolean days28 = month == 2; // for the month that has 28 days
        boolean days30 = month == 4 || month == 6 || month == 9 || month == 11;
        String result = "";

        if(valid) {
            if (days28) {
                result = "28 days";
            } else if (days30) {
                result = "30 days";
            } else {
                result = "30 days";
            }

        }else{
                result = "Invalid";
            }

        System.out.println(result);

        }


    }



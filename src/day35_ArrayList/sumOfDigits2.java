package day35_ArrayList;

public class sumOfDigits2 {

    public static void main(String[] args) {
        String str = "a1b2c3";
        int sum = 0;
        for(char each : str.toCharArray()){
            if(Character.isDigit(each)){ // isDigit(char): verifies if the char is digit, returns booli
                sum += Integer.parseInt(each + "");
            }
        }

        System.out.println(sum);


    }
}

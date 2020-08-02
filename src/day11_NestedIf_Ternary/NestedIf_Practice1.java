package day11_NestedIf_Ternary;

public class NestedIf_Practice1 {

    public static void main(String[] args) {
        double salary = 1200000;
        double history = 0.5;

        if(salary >= 30000){

            if(history >= 2){
                System.out.println("You are qualified");
            }else {
                System.out.println("You MUST have been employed for two years");
            }
        }else{
            System.out.println("You MUST earn at least 30K");
        }




    }


}

package day08_LogicalOperators;

public class Practice2 {

    public static void main(String[] args) {
        String firstName = "Khabib";
        String lastName = "Legend";
        String fullName = firstName + " " + lastName;
        int age = 45;
        String citizen = "Russia";
        String citizen2 = "Turkey";

        boolean eage = age >= 18;
        boolean usCitizen = citizen == "USA" || citizen2 == "USA";
        boolean vote = eage && usCitizen;
        System.out.println(fullName + " is eligible to vote for Trump: " + vote);



    }



}

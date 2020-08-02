package day08_LogicalOperators;

public class Practice {

    public static void main(String[] args) {
        int a = 19;
        String c = "USA";
        boolean vote = a >= 18 && c == "USA";
        //             19 >= 18 && USA == USA
        //              true    && true
        System.out.println(vote);

        String firstName = "Yousif";
        String lastName = "Alkhafagi";
        int a2 = 22;
        String c2 = "Afghanistan";
        String fullName = firstName + " " + lastName;
        boolean vote2 = a2 >= 18 && c2 == "USA";
        System.out.println(fullName + " is eligible to vote: " + vote2);





    }


}

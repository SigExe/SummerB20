package day05_ArithmeticOperators;

// First "EmployeeInfo" is under Self_Practices

public class EmployeeInfo2 {

    public static void main(String[] args) {

        String firstName = "Sergio";
        String lastName = "Garcia";
        char gender = 'M';
        byte age = 22;
        String companyName = "Apple";
        String jobTitle = "Code Master";
        boolean fullTime = true;
        boolean married = false;
        double salary = 120_000;
        String fullName = firstName + " " + lastName;

        System.out.println("Employee's full name is " + fullName);
        System.out.println(fullName + "'s" + " " + "gender is " + gender);
        System.out.println(fullName + "'s age is "+ age);
        System.out.println(fullName + " works at " + companyName);
        System.out.println(fullName + "'s title is " + jobTitle);
        System.out.println(fullName + " is full time employee: " + fullTime);
        System.out.println(fullName + " is married: " + married);
        System.out.println(fullName + "'s salary is " + salary); }

}

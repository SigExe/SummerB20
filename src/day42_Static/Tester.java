package day42_Static;

public class Tester {

    String name;
    char gender;
    long employeeID;
    String jobTitle;
    double salary;

    public void setInfo(String name, char gender, long employeeID, String jobTitle, double salary){
       this.name = name;
       this.gender = gender;
       this.employeeID = employeeID;
       this.jobTitle = jobTitle;
       this.salary = salary;
    }

    public void smokeTest(){
        System.out.println(name + " is smoke testing");
    }

    public void creatingTicket(){
        System.out.println(name + " is creatinga ticket");
    }

    public String toString(){
        return "Name: " + name + ", Gender: " + gender + ", EmployeeID: " + employeeID +
                ", Job Title: " + jobTitle + ", Salary: " + salary;
    }
}

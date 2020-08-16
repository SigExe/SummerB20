package day41_toString;

import java.util.Arrays;

public class Developers {

    String name;
    int salary;
    char gender;
    int age;

    public void setInfo(String name, int salary, char gender, int age){

        this.name = name;
        this.salary = salary;
        this.gender = gender;
        this.age = age;
    }

    public void coding(){
        System.out.println(name + " is coding");
    }

    public void fixBugs(){
        System.out.println(name + " is crying");
    }

    public String toString(){
        return "Name: " + name + ", Age: " + age + ", Gender: " + gender + ", Salary: " + salary;
    }
}

class developerObjects{

    public static void main(String[] args) {

        Developers[] devs = {new Developers(), new Developers(), new Developers(), new Developers(), new Developers()};
        devs[0].setInfo("Siggy", 175000, 'M', 27);
        devs[1].setInfo("Baba", 150000, 'F', 48);
        devs[2].setInfo("Gogo", 125000, 'M', 35);
        devs[3].setInfo("Ymir", 75000, 'N', 1200 );
        devs[4].setInfo("Allah", 200000, 'M', 1500);

        for(Developers each : devs){
            each.coding();
        }

        System.out.println("==========================");

        for(int i = 0; i <= devs.length - 1; i++){
            devs[i].fixBugs();
        }
    }

}
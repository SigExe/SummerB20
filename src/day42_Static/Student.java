package day42_Static;

public class Student {

    String name;
    int age;
    char gender;
    int groupNumber;

    static String schoolName = "Cybertek";
    static String favoriteTeacher = "Nadir";

    public void setInfo(String name, int age, char gender, int groupNumber){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.groupNumber = groupNumber;
    }

    public String toString(){
        return "School name: " + schoolName + "\nStudent Name: " + name;
    }
}

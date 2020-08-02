package day10_If_Statements;

public class GradeCalculator {

    public static void main(String[] args) {
        int score = 150;
        String grade = "";

        if(score >= 90 && score <= 100){
            grade = "You made A";
        } else if(score >= 80 && score <= 89){
            grade = "You made B";
        } else if(score >= 70 && score <= 79){
            grade = "You made C";
        } else if(score >= 60 && score <= 69){
            grade = "You made D";
        } else if(score <= 59){
            grade = "You made F";
        } else {
            grade = "Invalid Score";
        }

        System.out.println(grade);




    }


}

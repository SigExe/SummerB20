package day23_Arrays;

public class Array_Practice {

    public static void main(String[] args) {
       // String students =
        String[] students = {"Cybertek", "Muhtar", "Nadir", "Asiya"};
        //                        0          1        2       3
                 String name1 = students[1];
        System.out.println(name1);

        String[] students2 = {"Mike", "Adam", "Tonny", "John", "Amy"};
        //                       0       1       2        3      4
        int[] scores = {85, 70, 95, 90, 100};
        //               0   1   2   3   4

        /* System.out.println(students2[0] + " " + scores[0]);
        System.out.println(students2[1] + " " + scores[1]);
        System.out.println(students2[2] + " " + scores[2]);
        System.out.println(students2[3] + " " + scores[3]);
        System.out.println(students2[4] + " " + scores[4]); */

        for(int i = 0; i <= 4; i++){
            System.out.println(students2[i] + ": " + scores[i]);
        }

        System.out.println("==================================");

        String[] classmates = new String[5];
        classmates[0] = "Fatih";
        classmates[2] = "Hazel";
        classmates[1] = "Viorel";
        classmates[3] = "Elkem";
        classmates[4] = "Ahmed";

        for(int i = 0; i <= classmates.length -1; i++){
            System.out.println(classmates[i]);
        }



    }


}
